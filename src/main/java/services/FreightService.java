package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daos.DAO;
import models.Carrier;
import models.Route;

@Service
public class FreightService {
	
	private DAO dao;
	private Carrier carrier;//this will be whatever carrier is logged in at the time
	
	
	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	@Autowired
	public FreightService(DAO dao) {
		this.dao = dao;
	}
	
	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	public FreightService() {
		
	}
	
	public void addRoute(Route route) {
		dao.createRoute(route);
	}
	
	public List<Route> getAllRoutes() {
		return dao.getAllRoutes();
	}
	
	public List<Route> getAllRoutesByCarrier(){
		return dao.getRoutesByCarrierId(carrier.getCarrierId());
	}

}
