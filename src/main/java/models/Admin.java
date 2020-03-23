package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {


	@Id
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "username")//need the foreign key mapping
	private String username;
	
	@Column(name = "first_name")
	private String firstName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Admin(String lastName, String username, String firstName) {
		super();
		this.lastName = lastName;
		this.username = username;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Admin [lastName=" + lastName + ", username=" + username + ", firstName=" + firstName + "]";
	}
	
	
	
	
}
