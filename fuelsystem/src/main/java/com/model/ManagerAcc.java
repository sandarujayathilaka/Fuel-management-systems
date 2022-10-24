package com.model;

public class ManagerAcc {
	
	private int id;
	private String name;
	private String address;
	private String tel;
	private String password;
	
	public ManagerAcc(int id, String name, String address, String tel, String password) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.password = password;
	}

	public int getId() {
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
