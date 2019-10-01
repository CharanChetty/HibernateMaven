package com.zensar.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author CHARAN R
 * @version 1.0
 * @ creation_date 01st 0ct 2019 10.12PM
 * @ modification_date 01st 0ct 2019 10.12PM
 * @copyright Zensar Technologies. All rights reserved.
 * @description:It is a maven project.
 */
@Entity
public class Product {
	@Id
	@Column(name = "id")
	private int prod_id;
	private String name;
	private String brand;
	private float price;
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prod_id=" + prod_id + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
