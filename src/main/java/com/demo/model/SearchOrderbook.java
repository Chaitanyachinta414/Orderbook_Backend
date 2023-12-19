package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class SearchOrderbook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String PO;
	private String Opportunity_Description;
	private String Project_Name;
	private String Dev_IMP_Supp;
	private String Technology;
	private String Customer_Name;
	private String Project_vs_Annuity;
	private String Account_Name;
	private String po_availability;
	private String PID;
	public String getPO() {
		return PO;
	}
	public void setPO(String pO) {
		PO = pO;
	}
	public String getOpportunity_Description() {
		return Opportunity_Description;
	}
	public void setOpportunity_Description(String opportunity_Description) {
		Opportunity_Description = opportunity_Description;
	}
	public String getProject_Name() {
		return Project_Name;
	}
	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}
	public String getDev_IMP_Supp() {
		return Dev_IMP_Supp;
	}
	public void setDev_IMP_Supp(String dev_IMP_Supp) {
		Dev_IMP_Supp = dev_IMP_Supp;
	}
	public String getTechnology() {
		return Technology;
	}
	public void setTechnology(String technology) {
		Technology = technology;
	}
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getProject_vs_Annuity() {
		return Project_vs_Annuity;
	}
	public void setProject_vs_Annuity(String project_vs_Annuity) {
		Project_vs_Annuity = project_vs_Annuity;
	}
	public String getAccount_Name() {
		return Account_Name;
	}
	public void setAccount_Name(String account_Name) {
		Account_Name = account_Name;
	}
	public String getPo_availability() {
		return po_availability;
	}
	public void setPo_availability(String po_availability) {
		this.po_availability = po_availability;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	



}
