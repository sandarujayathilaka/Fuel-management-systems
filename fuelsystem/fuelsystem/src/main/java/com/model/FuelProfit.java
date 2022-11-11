package com.model;

public class FuelProfit {
	
	protected double transportCost;
	protected String id;
	protected String date;
	protected double tax;
	protected double dispenserMaintainCost;
	protected double initialQuantity;
	protected double dayPrice;
	protected double restQuantity;
	protected double profitShare;
	
	
	//FuelProfit default constructor
	public FuelProfit() {
		this.id ="NULL";
	}
	
	//para constructor
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


	//get the transport cost
	public double getTransportCost() {
		return transportCost;
	}

	//get the date
	public String getDate() {
		return date;
	}

	//get the tax value
	public double getTax() {
		return tax;
	}

	//get the dispenser maintaining cost
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
