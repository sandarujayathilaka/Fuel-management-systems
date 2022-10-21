package com.fuelsystem;

public class Employer {

	private int id;
	private String name;
	private String address;
	private String tel;
	private String nic;
	
	public Employer(int id, String name, String address, String tel, String nic) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.nic = nic;
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

	
}
