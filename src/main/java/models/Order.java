package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	
	@Id
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "route_id")//need to reference route table
	private int routeId;
	
	@Column(name = "customer_id")
	private int customerId;
	
	@Column(name = "pickup_location")
	private String pickupLocation;
	
	@Column(name = "delivery_location")
	private String deliveryLocation;
	
	@Column(name = "size_pallets")
	private int orderSize;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public int getOrderSize() {
		return orderSize;
	}

	public void setOrderSize(int orderSize) {
		this.orderSize = orderSize;
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", routeId=" + routeId + ", customerId=" + customerId + ", pickupLocation="
				+ pickupLocation + ", deliveryLocation=" + deliveryLocation + ", orderSize=" + orderSize + "]";
	}
	
	
	
}
