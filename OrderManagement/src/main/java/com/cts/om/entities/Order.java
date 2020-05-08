package com.cts.om.entities;

import java.sql.Date;
//import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long orderId;
	
	@Column(unique=true)
	private String orderDate;
	
	@NotNull
	@Column(unique=true)
	private double orderPrice;
	
	 @JsonManagedReference
	@OneToMany(mappedBy="order",fetch = FetchType.LAZY)
	private List<OrderItem> orderItem;
//	 private List<OrderItem> orderItem= new ArrayList<OrderItem>();


//	public Long getOrderId() {
//		return orderId;
//	}
//
//public void setOrderId(Long orderId) {
//	this.orderId = orderId;
//}
//
//	public Date getOrderDate() {
//		return orderDate;
//	}
//
//	public void setOrderDate(Date orderDate) {
//		this.orderDate = orderDate;
//	}
//
//	public double getOrderPrice() {
//		return orderPrice;
//	}
//
//	public void setOrderPrice(double orderPrice) {
//		this.orderPrice = orderPrice;
//	}
//
//	public List<OrderItem> getOrderItem() {
//		return orderItem;
//	}
//
//	public void setOrderItem(List<OrderItem> orderItem) {
//		this.orderItem = orderItem;
//	}

	 
	 

	public Order(Long orderId, String orderDate, double orderPrice, List<OrderItem> orderItem) {
	super();
	this.orderId = orderId;
	this.orderDate = orderDate;
	this.orderPrice = orderPrice;
	this.orderItem = orderItem;
}
public Order() {
	super();
}
public Order(Long orderId, String orderDate,  double orderPrice) {
	super();
	this.orderId = orderId;
	this.orderDate = orderDate;
	this.orderPrice = orderPrice;
}

	
	
	
}
