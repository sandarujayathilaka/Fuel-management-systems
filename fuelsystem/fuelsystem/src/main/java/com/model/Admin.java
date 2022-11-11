package com.model;

public class Admin {

	private int id;
	private String name;
	private String address;
	private String tel;
	private String nic;
	private String uname;
	private String password;
	
	//Admin constructor
	public Admin(int id, String name, String address, String tel, String nic,String uname,String pass) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.nic = nic;
		this.uname=uname;
		this.password=pass;
	}

	//get the admin id
	public int getId() {
		return id;
	}

	//get the admin name
	public String getName() {
		return name;
	}

	//get the admin address
	public String getAddress() {
		return address;
	}
    
	//get the admin contact number
	public String getTel() {
		return tel;
	}

	//get the admin nic
	public String getNic() {
		return nic;
	}
	
	//get the admin user name
	public String getUname() {
		return uname;
	}
	
	//get the admin password
	public String getPassword() {
		return password;
	}

	
}
