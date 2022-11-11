package com.model;

public class FuelManagerAcc extends ManagerAcc {
	
	private String nic;
	private String maritStataus;
	
	public FuelManagerAcc(String id, String name, String address, String tel, String password,String nic,String mariStatus) {
		
		super(id, name, address, tel, password);

		this.nic = nic;
		this.maritStataus = mariStatus;
		
	}

	//get the fuel manager NIC
	public String getNic() {
		return nic;
	}

	//get the maritial status
	public String getMaritStataus() {
		return maritStataus;
	}
	

}
