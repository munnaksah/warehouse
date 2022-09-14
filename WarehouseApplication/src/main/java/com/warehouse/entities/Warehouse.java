package com.warehouse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Warehouse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int id;
	private String warehouse;
	private String widgets;
	private String gadgets;
	private double price;
	private String title;
	private long expirydate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}
	public String getWidgets() {
		return widgets;
	}
	public void setWidgets(String widgets) {
		this.widgets = widgets;
	}
	public String getGadgets() {
		return gadgets;
	}
	public void setGadgets(String gadgets) {
		this.gadgets = gadgets;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(long expirydate) {
		this.expirydate = expirydate;
	}
	
	
	
	

	
	

}
