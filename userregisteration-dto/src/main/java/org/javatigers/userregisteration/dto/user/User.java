package org.javatigers.userregisteration.dto.user;

/**
 * DTO class to handle the field of user 
 * @author sk
 *
 */
public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;

	public User() {
	}

	public User(final String firstName, final String lastName, String phoneNum, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}


	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	// setters

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

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


}
