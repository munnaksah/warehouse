package com.warehouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.entities.Warehouse;
import com.warehouse.repository.WarehouseRepository;
@Service
public class WarehouseServiceImpl implements WarehouseService {
	
	@Autowired
	private WarehouseRepository warehouserepo;

	@Override
	public void saveDetails(Warehouse w) {
		warehouserepo.save(w);
		
	}

	@Override
	public List<Warehouse> getLeads() {
		List<Warehouse>findAll=warehouserepo.findAll();
	
		return findAll;
	}

	@Override
	public void deleteDetailsid(int id) {
		warehouserepo.deleteById(id);
		
	}

	@Override
	public Warehouse finedoneLead(int id) {
		
		 Optional<Warehouse> findById = warehouserepo.findById(id);
		 Warehouse w = findById.get();
		return w;
	}

	

}
