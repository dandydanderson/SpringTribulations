package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.DAO;
import com.revature.models.Carrier;
import com.revature.models.Route;

@Service
public class FreightService implements FreightServiceInterface{
	
	private DAO dao;
	private Carrier carrier;//this will be whatever carrier is logged in at the time
	
	@Override
	public Carrier getCarrier(int id) {
		return dao.getCarrier(id);
	}
	

	@Autowired
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	@Override
	public void addRoute(Route route) {
		dao.createRoute(route);
	}
	@Override
	public List<Route> getAllRoutes() {
		return dao.getAllRoutes();
	}
	@Override
	public List<Route> getAllRoutesByCarrier(){
		return dao.getRoutesByCarrierId(carrier.getCarrierId());
	}

}
