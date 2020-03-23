package com.revature.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.revature.models.Admin;
import com.revature.models.Carrier;
import com.revature.models.Customer;
import com.revature.models.Order;
import com.revature.models.Route;
import com.revature.models.User;

@Component
public class DAO implements DAOInterface {
	
	private SessionFactory sf;
	
	@Autowired
	public  void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	
//////////////////////
// CREATE
////////////////
	@Override
	public void createUser(User user) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(user);
		tx.commit();	
	}
	@Override
	public void createAdmin(Admin admin) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(admin);
		tx.commit();
	}
	@Override
	public void createCustomer(Customer customer) {
		
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(customer);
		tx.commit();
	}
	@Override
	public void createCarrier(Carrier carrier) {

		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(carrier);
		tx.commit();
	}
	@Override
	public void createOrder(Order order) {

		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(order);
		tx.commit();
	}
	@Override
	public void createRoute(Route route) {

		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(route);
		tx.commit();
	}
	
	
//////////////////////
//READ
////////////////
	
	@Override
	public User getUser(String username, String password) {
		
		Session sess = sf.openSession();
		User user = sess.get(User.class, username);
		
		if (user.getPassword() == password) {//user validation here. Probably should throw some exception instead of just null
			return user;
		}
		else {
			return null;
		}
	}
	@Override
	public List<User> getAllUsers() {
	
		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();//need to read into all of these objects
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> rootEntry = cq.from(User.class);
		CriteriaQuery<User> all = cq.select(rootEntry);
		
		TypedQuery<User> allQuery = sess.createQuery(all);	
		return allQuery.getResultList();	
	}
	@Override
	public Admin getAdmin(String lastName) {
		
		Session sess = sf.openSession();
		return sess.get(Admin.class, lastName);
	}
	@Override
	public List<Admin> getAllAdmins() {
		
		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaQuery<Admin> cq = cb.createQuery(Admin.class);
		Root<Admin> rootEntry = cq.from(Admin.class);
		CriteriaQuery<Admin> all = cq.multiselect(rootEntry);
		
		TypedQuery<Admin> allQuery = sess.createQuery(all);
		return allQuery.getResultList();
		
	}
	@Override
	public Customer getCustomer(int customerId) {

		Session sess = sf.openSession();
		return sess.get(Customer.class, customerId);
	}
	@Override
	public List<Customer> getAllCustomers() {

		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaQuery<Customer> cq = cb.createQuery(Customer.class);
		Root<Customer> rootEntry = cq.from(Customer.class);
		CriteriaQuery<Customer> all = cq.multiselect(rootEntry);
		
		TypedQuery<Customer> allQuery = sess.createQuery(all);
		return allQuery.getResultList();
	}
	@Override
	public Carrier getCarrier(int carrierId) {

		Session sess = sf.openSession();
		return sess.get(Carrier.class, carrierId);
	}
	@Override
	public List<Carrier> getAllCarriers() {

		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaQuery<Carrier> cq = cb.createQuery(Carrier.class);
		Root<Carrier> rootEntry = cq.from(Carrier.class);
		CriteriaQuery<Carrier> all = cq.multiselect(rootEntry);
		
		TypedQuery<Carrier> allQuery = sess.createQuery(all);
		return allQuery.getResultList();
	}
	@Override
	public Order getOrder(int orderId) {

		Session sess = sf.openSession();
		return sess.get(Order.class, orderId);
	}
	@Override
	public List<Order> getAllOrders() {

		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaQuery<Order> cq = cb.createQuery(Order.class);
		Root<Order> rootEntry = cq.from(Order.class);
		CriteriaQuery<Order> all = cq.multiselect(rootEntry);
		
		TypedQuery<Order> allQuery = sess.createQuery(all);
		return allQuery.getResultList();
	}
	@Override
	public List<Order> getOrdersByCustomerId(int customerId) {//this is gonna be a variation of the code on the get all types
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Route getRoute(int routeId) {

		Session sess = sf.openSession();
		return sess.get(Route.class, routeId);
	}
	@Override
	public List<Route> getAllRoutes() {

		Session sess = sf.openSession();
		CriteriaBuilder cb = sess.getCriteriaBuilder();
		CriteriaQuery<Route> cq = cb.createQuery(Route.class);
		Root<Route> rootEntry = cq.from(Route.class);
		CriteriaQuery<Route> all = cq.multiselect(rootEntry);
		
		TypedQuery<Route> allQuery = sess.createQuery(all);
		return allQuery.getResultList();
	}
	@Override
	public List<Route> getRoutesByCarrierId(int carrierId) {//modified select all code
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateOrderRouteId(int orderId, int routeId) {
		// TODO Auto-generated method stub

	}
	@Override
	public void updateRouteAvailableSpace(int addedPallets) {
		// TODO Auto-generated method stub

	}

}
