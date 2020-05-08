package com.cts.pm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;


@Entity
@Table(name="product")
@Data
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long productId;
	
	@NotNull
	@Size(max=20)
	@Column(unique=true)
	@NotBlank(message="Product name cant be blank")
	private String productName;
	
	@NotNull
	@Size(max=200)
	@Column(unique=true)
	private String description;
	
	@NotNull
	@Column(unique=true)

	private double price;

	public Product() {
		super();
	}

	public Product(Long productId,
			 String productName,
			 String description,double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
	}
	
	
	
//	@Column
//	private Long vandor_Id;
////	@ManyToOne
//	@Transient
//	private Vendor vendor;

//	public Long getProductId() {
//		return productId;
//	}
//
//	public void setProductId(Long productId) {
//		this.productId = productId;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}

	
	
	
	
//	public Vendor getVendor() {
//		return vendor;
//	}
//
//	public void setVendor(Vendor vendor) {
//		this.vendor = vendor;
//	}

//	public Long getVandor_Id() {
//		return vandor_Id;
//	}
//
//	public void setVandor_Id(Long vandor_Id) {
//		this.vandor_Id = vandor_Id;
//	}
//	
	

}
