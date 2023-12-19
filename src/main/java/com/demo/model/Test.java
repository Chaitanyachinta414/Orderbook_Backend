package com.demo.model;

import com.google.gson.Gson;

public class Test {
	
	public static void main(String[] args) {
		SearchOrderbook obj = new SearchOrderbook();
		obj.setPO("Renewal Forecast");
		obj.setOpportunity_Description("RFR - Program");
		obj.setProject_Name(" RFR Quality Control Audit ");
		obj.setDev_IMP_Supp(" Development ");
		obj.setTechnology(" Java/Java Full Stack ");
		obj.setCustomer_Name(" General Electric Company ");
		obj.setProject_vs_Annuity(" Annuity");
		obj.setAccount_Name("GE Power");
		obj.setPo_availability("PO Available");
		obj.setPID("32780");
		Gson gson = new Gson();
		String json = gson.toJson(obj);
		System.out.println(json);
 
	}
	

}
