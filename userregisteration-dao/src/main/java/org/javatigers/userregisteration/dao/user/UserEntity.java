package org.javatigers.userregisteration.dao.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.javatigers.userregisteration.dto.user.User;

/**
 * 
 * @author sk
 *
 */
@Entity
@Table(name = "USER")
public class UserEntity {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public UserEntity() {
	}

	public UserEntity(User user) {
		this.id = user.getId();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
	}

	public UserEntity(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public User toUser() {
		User user = new User();
		user.setId(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		return user;
	}

}
