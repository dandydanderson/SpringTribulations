package com.revature.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carriers", schema = "public")
public class Carrier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "carrier_id")
	private int carrierId;
	
	@Column(name = "carrier_name")
	private String carrierName;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "mc_number")
	private String mcNumber;
	
	@Column(name = "dot_number")
	private String dotnumber;
	

	@Column(name = "tax_id")
	private int taxId;
	
	@Column(name = "poc_firstname")
	private String pocFirstName;
	
	@Column(name = "poc_lastname")
	private String pocLastName;
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@Column(name = "fax_number")
	private int faxNumber;
	
	@Column(name = "truck_number")
	private int numberOfTrucks;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	@Column(name = "classification")
	private String classification;
	
	@Column(name = "date_submitted")
	private Timestamp dateSubmitted;
	
	@Column(name = "passwords")
	private String password;

	public int getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(int carrierId) {
		this.carrierId = carrierId;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMcNumber() {
		return mcNumber;
	}

	public void setMcNumber(String mcNumber) {
		this.mcNumber = mcNumber;
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

	public int getNumberOfTrucks() {
		return numberOfTrucks;
	}

	public void setNumberOfTrucks(int numberOfTrucks) {
		this.numberOfTrucks = numberOfTrucks;
	}

	
	public String getDotnumber() {
		return dotnumber;
	}

	public void setDotnumber(String dotnumber) {
		this.dotnumber = dotnumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public Timestamp getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(Timestamp dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public Carrier(int carrierId, String carrierName, String username, String mcNumber, int taxId, int phoneNumber,
			int faxNumber, int numberOfTrucks, Timestamp dateSubmitted) {
		super();
		this.carrierId = carrierId;
		this.carrierName = carrierName;
		this.username = username;
		this.mcNumber = mcNumber;
		this.taxId = taxId;
		this.phoneNumber = phoneNumber;
		this.faxNumber = faxNumber;
		this.numberOfTrucks = numberOfTrucks;
		this.dateSubmitted = dateSubmitted;
	}

	public Carrier() {
		super();
	}

	@Override
	public String toString() {
		return "Carrier [carrierId=" + carrierId + ", carrierName=" + carrierName + "]";
	}
	
	
	
	
	
	
	
}

