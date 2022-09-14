package com.warehouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.warehouse.entities.Warehouse;
import com.warehouse.service.WarehouseService;

@Controller
public class WarehouseController {
	
	@Autowired
	private WarehouseService warehouseservice;
	
	
	@RequestMapping("/show")
	public String showSaveWarehouse() {
		return"create";
	}
	
	@RequestMapping("/save")
	public String saveDetails(@ModelAttribute("MA") Warehouse w) {
		warehouseservice.saveDetails(w);
		
		return "create";
	}
	
	@RequestMapping("/list")
	public String getDetails(Model map) {
		List<Warehouse>lead = warehouseservice.getLeads();
		
		map.addAttribute("leads",lead);
		return"list";
		
	}
	
	@RequestMapping("/delete")
	public String  deleteDetails(@RequestParam("id")int id,Model m) {
		warehouseservice.deleteDetailsid(id);
		
		List<Warehouse>lead =  warehouseservice.getLeads();
		m.addAttribute("lead",lead);
		return "list";
	}
	@RequestMapping("/update")
	public String UpdateLead(@RequestParam("id")int id, Model m) {
		Warehouse w =  warehouseservice.finedoneLead(id);
		m.addAttribute("leads",w);
				return "update";
	}
	@RequestMapping("/updated")
	public String UpdateLead(@ModelAttribute ("lead")Warehouse w ,Model map) {
		warehouseservice.saveDetails(w);
		List<Warehouse> lead =  warehouseservice.getLeads();
		map.addAttribute("lead",lead);
		return "list";
		
		
	}
	
	

}
