package com.model;

public class ManagerAcc {
	
	protected String id;
	protected String name;
	protected String address;
	protected String tel;
	protected String password;
	
	//para constructor
	public ManagerAcc(String id, String name, String address, String tel, String password) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.password = password;
	}

	//get the manager id
	public String getId() {
		return id;
	}
	
	//get the manager name
	public String getName() {
		return name;
	}

	//get the manager address
	public String getAddress() {
		return address;
	}

	//get the manager contact no
	public String getTel() {
		return tel;
	}

	//get the password
	public String getPassword() {
		return password;
	}


}
