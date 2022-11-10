package com.model;

public class FuelProfit implements ProfitInterface {
	
	protected double transportCost;
	protected String id;
	protected String date;
	protected double tax;
	protected double dispenserMaintainCost;
	protected double initialQuantity;
	protected double dayPrice;
	protected double restQuantity;
	protected double profitShare;
	
	
	public FuelProfit() {
		this.id ="NULL";
	}

	public FuelProfit(String id,String date,double transportCost, double tax, double dispenserMaintainCost, double initialQuantity,
			double dayPrice, double restQuantity,double profitShare) {
		
		this.id=id;
		this.date = date;
		this.transportCost = transportCost;
		this.tax = tax;
		this.dispenserMaintainCost = dispenserMaintainCost;
		this.initialQuantity = initialQuantity;
		this.dayPrice = dayPrice;
		this.restQuantity = restQuantity;
		this.profitShare = profitShare;
	}


	public double calprofit() {
		return 0;
	}
	
	
	public double soldPetroleumValue() {
		
		double sold = this.initialQuantity - this.restQuantity;
		return sold;
		
	}
	


	public double getTransportCost() {
		return transportCost;
	}


	public String getDate() {
		return date;
	}


	public double getTax() {
		return tax;
	}


	public double getDispenserMaintainCost() {
		return dispenserMaintainCost;
	}


	public double getInitialQuantity() {
		return initialQuantity;
	}


	public double getDayPrice() {
		return dayPrice;
	}


	public double getRestQuantity() {
		return restQuantity;
	}


	public double getProfitShare() {
		return profitShare;
	}
	
	

	public String getId() {
		return id;
	}
	
}
