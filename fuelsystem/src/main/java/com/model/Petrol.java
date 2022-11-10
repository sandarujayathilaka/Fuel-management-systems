package com.model;

public class Petrol extends FuelProfit {
	
    public Petrol() {
    	
    	id = "NULL";
    }
	
	public Petrol(String id,String date, double transportCost, double tax, double dispenserMaintainCost, double initialQuantity,
			double dayPrice, double restQuantity, double profitShare) {
		
		super(id,date, transportCost, tax, dispenserMaintainCost, initialQuantity, dayPrice, restQuantity, profitShare);

		
	}
	
	public double calprofit() {
		
		double soldpet = soldPetroleumValue();
		double profit = (soldpet * this.dayPrice)*(this.profitShare/100) - (this.transportCost+this.tax+this.dispenserMaintainCost);
		
		if (profit>1000000.00) {
			
			profit = profit - (profit * 0.5/100); //0.5 is lifetime special tax for petrol income.
		}
		
		return profit;
	}
	


}
