package com.revature.dao;

import java.util.List;

import com.revature.models.Admin;
import com.revature.models.Carrier;
import com.revature.models.Customer;
import com.revature.models.Order;
import com.revature.models.Route;
import com.revature.models.User;

public interface DAOInterface {
	
	//users, admins, customers, carriers, orders, routes
	
	//CREATE
	
	public void createUser(User user);
	
	public void createAdmin(Admin admin);
	
	public void createCustomer(Customer customer);
	
	public void createCarrier(Carrier carrier);
	
	public void createOrder(Order order);
	
	public void createRoute (Route route);
	
	//READ 
	
	public User getUser(String username, String password);
	
	public List<User> getAllUsers();
	
	public Admin getAdmin (String lastName);
	
	public List<Admin> getAllAdmins();
	
	public Customer getCustomer(int customerId);
	
	public List<Customer> getAllCustomers();
	
	public Carrier getCarrier(int carrierId);
	
	public List<Carrier> getAllCarriers();
	
	public Order getOrder(int orderId);
	
	public List<Order> getAllOrders();
	
	public List<Order> getOrdersByCustomerId(int customerId);
	
	public Route getRoute(int routeId);
	
	public List<Route> getAllRoutes();
	
	public List<Route> getRoutesByCarrierId(int carrierId);
		
	
	//UPDATE
	
	public void updateOrderRouteId(int orderId, int routeId);
	
	public void updateRouteAvailableSpace(int addedPallets);
	
	
	//DELETE
	
	
	

}
