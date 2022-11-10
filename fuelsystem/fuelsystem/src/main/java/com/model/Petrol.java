package com.model;

public class Petrol extends FuelProfit implements ProfitInterface {
	
    public Petrol() {
    	
    	id = "NULL";
    }
	
	public Petrol(String id,String date, double transportCost, double tax, double dispenserMaintainCost, double initialQuantity,
			double dayPrice, double restQuantity, double profitShare) {
		
		super(id,date, transportCost, tax, dispenserMaintainCost, initialQuantity, dayPrice, restQuantity, profitShare);

		
	}
	
	public double calprofit() {
		
		double soldpet = soldPetroleumValue();
		//calculate the profit
		double profit = (soldpet * this.dayPrice)*(this.profitShare/100) - (this.transportCost+this.tax+this.dispenserMaintainCost);
		
		if (profit>1000000.00) {
			
			profit = profit - (profit * 0.5/100); //0.5 is lifetime special tax for petrol income and detucted if profit>100000
		}
		
		return profit;
	}
	
	
	public double soldPetroleumValue() {
		
		double sold = this.initialQuantity - (this.restQuantity+2000); //2000 is addtitional fixed sold fuel quntity for emegency services
		return sold;
		
	}


}
