package com.cg.sprint.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table (name = "todo")
public class Todo {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private int taskId;
     
    @Column (name = "task_name")
    private String taskName;
        
    @Column (name = "task_location")
    private String location;

	@JsonFormat(pattern = "yyyy-mm-dd", timezone = "Asia/Kolkata")
	private Date createdAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt=new Date();
	}
	
    @ManyToMany(fetch = FetchType.LAZY,
    	      cascade = {
    	          CascadeType.PERSIST,
    	          CascadeType.MERGE
    	      },
    	      mappedBy = "todo")
    	  @JsonIgnore
    	  private Set<Remainder> remainders = new HashSet<>();	
    
    @ManyToOne
 @JsonIgnore
    @JoinColumn(name="user_id")
    private AppUser appUser;
    

	
	public Todo() {
		super();
		
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public AppUser getAppUser() {
		return appUser;
	}
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}
	public Set<Remainder> getRemainders() {
		return remainders;
	}
	public void setRemainders(Set<Remainder> remainders) {
		this.remainders = remainders;
	}

	public void addremainder(Remainder remainder) {
		this.remainders.add(remainder);
		
	}
	public void removeremainder(Remainder remainder) {
		this.remainders.remove(remainder);
	}
	
@Override
public String toString() {
	return "Task [taskid=" + taskId + ", taskName=" + taskName + ",Location=" + location + ", remainder="
			+ remainders  + ", appusers=" + appUser+ ", createdAt=" + createdAt+"]";
}

}
