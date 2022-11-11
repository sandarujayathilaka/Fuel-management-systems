package com.model;

public class SerManagerAcc extends ManagerAcc{

	
	private String branch;
	private String startdate;
	private String email;
	
	//SerManagerAcc para constructor
	public SerManagerAcc(String id, String name, String address, String tel, String password,String branch,String startdate,String email) {
		
		super(id, name, address, tel, password);
		
		this.branch = branch;
		this.startdate =startdate;
		this.email =email;
		
	}


	//get the branch name
	public String getBranch() {
		return branch;
	}

	//get the startdate
	public String getStartdate() {
		return startdate;
	}

	//get the email
	public String getEmail() {
		return email;
	}

}
