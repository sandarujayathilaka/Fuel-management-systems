package com.model;

public class Admin {

	private int id;
	private String name;
	private String address;
	private String tel;
	private String nic;
	private String uname;
	private String password;
	
	public Admin(int id, String name, String address, String tel, String nic,String uname,String pass) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.nic = nic;
		this.uname=uname;
		this.password=pass;
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

	public String getNic() {
		return nic;
	}
	
	public String getUname() {
		return uname;
	}
	
	public String getPassword() {
		return password;
	}

	
}
