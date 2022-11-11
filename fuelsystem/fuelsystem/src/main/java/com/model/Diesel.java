package com.model;

public class Diesel extends FuelProfit implements ProfitInterface {

	public Diesel(String id,String date,double transportCost, double tax, double dispenserMaintainCost, double initialQuantity,
			double dayPrice, double restQuantity,double profitShare) {
		
		super(id,date,transportCost, tax, dispenserMaintainCost, initialQuantity, dayPrice, restQuantity,profitShare);
		
	}
	
	//Diesel default constructor
	public Diesel() {
		super();
	}

	//calculate the profit
	public double calprofit() {
		
		double soldpet = soldPetroleumValue();//get the sold diesel value 
		
		//calculate the diesel profit
		double profit = (soldpet * this.dayPrice)*(this.profitShare/100) - (this.transportCost+this.tax+this.dispenserMaintainCost);
		return profit;
	}
	
	//get the sold diesel value
	public double soldPetroleumValue() {
		
		double sold = this.initialQuantity - this.restQuantity; //calculate the sold diesel value
		return sold;
		
	}
	
	
}
