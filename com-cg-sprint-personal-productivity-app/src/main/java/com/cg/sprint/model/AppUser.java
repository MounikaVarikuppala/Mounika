   package com.cg.sprint.model;

   import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
   import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
   import javax.validation.constraints.Max;
   import javax.validation.constraints.Min;
   import javax.validation.constraints.NotBlank;
   import javax.validation.constraints.Pattern;

   @Entity
   @Table(name = "app_users") 
   public class AppUser {

	   
	   
	 
   	@Id
   	@GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(name = "user_id")
   	private int userId;

   
   	@Column(name = "first_name")
   	private String firstName; 
   	
   	@Column(name = "last_name")   
   	private String lastName;
   	
   	@Column(name = "email_id")
   	private String emailId;
   	
   	
   	@Column(name = "mobile_no")
   	private long mobileNo;
   		
   	  	  	
   	@Column(name = "user_name")
   	@NotBlank
   	private String userName;

   	@Column(name = "password")
   	@NotBlank
   	@Min(4)
   	@Max(32)
   	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
   	private String password;

   	@OneToMany(mappedBy = "appUser" ,cascade = CascadeType.ALL)
   	private List<Todo> todos;
   	
  
   	public AppUser() {
   		super();
   	}

   	public AppUser(String userName, String password) {
   		super();
   		this.userName = userName;
   		this.password = password;

   	}

	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}
	
 	@Override
   	public String toString() {
   		return "AppUser [userName=" + userName + ", password=" + password + "]";
   	}


   }
