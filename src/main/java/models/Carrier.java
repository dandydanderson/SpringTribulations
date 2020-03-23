package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carriers")
public class Carrier {
	
	@Id
	@Column(name = "carrier_id")
	private int carrierId;
	
	@Column(name = "carrier_name")
	private String carrierName;
	
	//@OneToOne//need one to one relationship here. Gotta figure out how to set it up exactly, needs more
	@Column(name = "username")
	private String username;
	
	@Column(name = "mc_number")
	private String mcNumber;
	
	@Column(name = "tax_id")
	private int taxId;
	
	@Column(name = "phone_number")
	private int phoneNumber;
	
	@Column(name = "fax_number")
	private int faxNumber;
	
	@Column(name = "truck_number")
	private int numberOfTrucks;
	
	@Column(name = "date_submitted")
	private Timestamp dateSubmitted;

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
