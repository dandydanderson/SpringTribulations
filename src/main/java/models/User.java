package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "pw")
	private String password;
	
	@Column
	private String userType; //I probably need to make this an enum, will change later.
	
	
	public User(String username, String password, String userType) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
	}
	
	
	public User() {
		super();
	}

	

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userType=" + userType + "]";
	}
	
	
	

}
