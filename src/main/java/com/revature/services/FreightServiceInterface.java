package com.revature.services;

import java.util.List;


import com.revature.models.Carrier;
import com.revature.models.Route;

public interface FreightServiceInterface {
	public Carrier getCarrier(int id);
	public void addRoute(Route route);
	public List<Route> getAllRoutes();
	public List<Route> getAllRoutesByCarrier();
}
