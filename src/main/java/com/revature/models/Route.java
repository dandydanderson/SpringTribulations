package com.revature.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "routes")
public class Route {
	

	
	@Id
	@Column(name = "route_id")
	private int routeId;
	
	@Column(name = "truck_number")
	private int truckId;
	
	//@ManyToOne//modify this relationship to make sure it works
	@Column(name = "carrier_id")
	private int carrierId;
	
	@Column(name = "start_location")
	private String startLocation;
	
	@Column(name = "start_date")
	private Timestamp startDate;
	
	@Column(name = "end_location")
	private String endLocation;
	
	@Column(name = "end_date")
	private Timestamp endDate;
	
	@Column(name = "available_pallets")
	private int availablePallets;

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public int getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(int carrierId) {
		this.carrierId = carrierId;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getAvailablePallets() {
		return availablePallets;
	}

	public void setAvailablePallets(int availablePallets) {
		this.availablePallets = availablePallets;
	}

	public Route(int routeId, int truckId, int carrierId, String startLocation, Timestamp startDate, String endLocation,
			Timestamp endDate, int availablePallets) {
		super();
		this.routeId = routeId;
		this.truckId = truckId;
		this.carrierId = carrierId;
		this.startLocation = startLocation;
		this.startDate = startDate;
		this.endLocation = endLocation;
		this.endDate = endDate;
		this.availablePallets = availablePallets;
	}

	public Route() {
		super();
	
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", truckId=" + truckId + ", carrierId=" + carrierId + ", startLocation="
				+ startLocation + ", startDate=" + startDate + ", endLocation=" + endLocation + ", endDate=" + endDate
				+ ", availablePallets=" + availablePallets + "]";
	}
	
	
	

}
