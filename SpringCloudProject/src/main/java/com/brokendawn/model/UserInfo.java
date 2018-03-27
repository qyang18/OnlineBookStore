package com.brokendawn.model;

public class UserInfo {
	String ID;
	String Password;
	String Name;
	String Address;
	int Age;

	public UserInfo(String iD, String password, String name, String address, int age) {
		super();
		ID = iD;
		Password = password;
		Name = name;
		Address = address;
		Age = age;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
}
