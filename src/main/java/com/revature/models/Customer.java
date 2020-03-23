package com.revature.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {
	
	
	
	
	@Id
	@Column(name = "customer_id")
	private int customerId;
	
	
	
	@Column(name = "company_name")
	private String companyName;
	
	
	//@OneToOne
	@Column(name = "username")
	private String username;
	
	
	@Column(name = "shipping_phone")
	private int shippingPhone;
	
	
	@Column(name = "payables_phone")
	private int payablesPhone;
	
	
	@Column(name = "tax_id")
	private int taxId;
	
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	
	@Column(name = "fax_number")
	private int faxNumber;
	
	
	@Column(name = "poc_email")
	private String pocEmail;
	
	
	@Column(name = "poc_firstname")
	private String pocFirstName;
	
	
	@Column(name = "poc_lastname")
	private String pocLastName;
	
	
	@Column(name = "poc_phone")
	private int pocPhone;
	
	
	@Column(name = "street_address")
	private String streetAddress;
	
	
	@Column(name = "city")
	private String city;
	
	
	@Column(name = "state")
	private String state;
	
	
	@Column(name = "zip")
	private int zip;
	
	
	@Column(name = "date_submitted")
	private Timestamp dateSubmitted;
	
	
	@Column(name = "credit_line")
	private int creditLine;
	
	
	@Column(name = "d_b_score")
	private int dbScore;


	public Customer() {
		super();
	
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getShippingPhone() {
		return shippingPhone;
	}


	public void setShippingPhone(int shippingPhone) {
		this.shippingPhone = shippingPhone;
	}


	public int getPayablesPhone() {
		return payablesPhone;
	}


	public void setPayablesPhone(int payablesPhone) {
		this.payablesPhone = payablesPhone;
	}


	public int getTaxId() {
		return taxId;
	}


	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getFaxNumber() {
		return faxNumber;
	}


	public void setFaxNumber(int faxNumber) {
		this.faxNumber = faxNumber;
	}


	public String getPocEmail() {
		return pocEmail;
	}


	public void setPocEmail(String pocEmail) {
		this.pocEmail = pocEmail;
	}


	public String getPocFirstName() {
		return pocFirstName;
	}


	public void setPocFirstName(String pocFirstName) {
		this.pocFirstName = pocFirstName;
	}


	public String getPocLastName() {
		return pocLastName;
	}


	public void setPocLastName(String pocLastName) {
		this.pocLastName = pocLastName;
	}


	public int getPocPhone() {
		return pocPhone;
	}


	public void setPocPhone(int pocPhone) {
		this.pocPhone = pocPhone;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public Timestamp getDateSubmitted() {
		return dateSubmitted;
	}


	public void setDateSubmitted(Timestamp dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}


	public int getCreditLine() {
		return creditLine;
	}


	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}


	public int getDbScore() {
		return dbScore;
	}


	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", companyName=" + companyName + ", username=" + username + "]";
	}
	
	

}
