package com.warehouse.service;

import java.util.List;

import com.warehouse.entities.Warehouse;

public interface WarehouseService {

	 public void saveDetails(Warehouse w);

	public List<Warehouse> getLeads();

	public void deleteDetailsid(int id);

	public Warehouse finedoneLead(int id);

	
	 

}
