package com.model;

public class SerManagerAcc extends ManagerAcc{

	
	private String branch;
	private String startdate;
	private String email;
	
	
	public SerManagerAcc(String id, String name, String address, String tel, String password,String branch,String startdate,String email) {
		
		super(id, name, address, tel, password);
		
		this.branch = branch;
		this.startdate =startdate;
		this.email =email;
		
	}


	public String getBranch() {
		return branch;
	}


	public String getStartdate() {
		return startdate;
	}


	public String getEmail() {
		return email;
	}

}
