package com.cg.sprint.model;

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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
	@Table(name = "remainder")
	public class Remainder {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int remainder_id;
	  @Column(name = "status")
	  private String status;
	  
	  @ManyToMany(fetch = FetchType.LAZY,
		      cascade = {
		          CascadeType.PERSIST,
		          CascadeType.MERGE
		      })
		  @JoinTable(name = "task_rem",
		        joinColumns = { @JoinColumn(name = "remainder_id") },
		        inverseJoinColumns = { @JoinColumn(name = "task_id") })
	  @JsonIgnore
		  private Set<Todo> todo = new HashSet<>();
	  
	public Remainder() {
		super();
	
	}
	
	public int getRemainder_id() {
		return remainder_id;
	}

	public void setRemainder_id(int remainder_id) {
		this.remainder_id = remainder_id;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<Todo> getTodo() {
		return todo;
	}
	public void setTodo(Set<Todo> todo) {
		this.todo = todo;
	}
}
//public void addTodo(Todo tag) {
//    this.tags.add(tag);
//    tag.getTutorials().add(this);
//  }
//  
//  public void removeTag(long tagId) {
//    Tag tag = this.tags.stream().filter(t -> t.getId() == tagId).findFirst().orElse(null);
//    if (tag != null) {
//      this.tags.remove(tag);
//      tag.getTutorials().remove(this);
//    }
//  }
//}