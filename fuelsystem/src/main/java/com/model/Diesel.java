package com.model;

public class Diesel extends FuelProfit {

	public Diesel(String id,String date,double transportCost, double tax, double dispenserMaintainCost, double initialQuantity,
			double dayPrice, double restQuantity,double profitShare) {
		
		super(id,date,transportCost, tax, dispenserMaintainCost, initialQuantity, dayPrice, restQuantity,profitShare);
		
	}
	
	
	public Diesel() {
		super();
	}

	public double calprofit() {
		
		double soldpet = soldPetroleumValue();
		double profit = (soldpet * this.dayPrice)*(this.profitShare/100) - (this.transportCost+this.tax+this.dispenserMaintainCost);
		return profit;
	}
	
	
	
}
