package com.model;

public class ManagerAcc {
	
	protected String id;
	protected String name;
	protected String address;
	protected String tel;
	protected String password;
	
	public ManagerAcc(String id, String name, String address, String tel, String password) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getTel() {
		return tel;
	}

	public String getPassword() {
		return password;
	}


}
