package com.lean.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lean.dao.RegionDAO;
import com.lean.entity.Region;
import com.lean.service.RegionService;

@Controller
@RequestMapping("/Region")
public class RegionController {

	@Autowired
	private RegionService regionservice;
	
	@GetMapping("/list")
	public String listRegion(Model theModel) {
		
		//get the customer from dao
		List<Region> theRegion = regionservice.getRegion();
		
		//add the customer to the model
		theModel.addAttribute("region", theRegion);
		
		return "list-Region"; 
	}
	
	@RequestMapping("/showformforAdd")
	public String showformforAdd(Model theModel) {
		
		Region theRegion = new Region();
		theModel.addAttribute("region", theRegion);
		
		return "region-form";
	}
	
	@PostMapping("/saveRegion")
	public String saveRegion(@ModelAttribute("region") Region theregion) {
		//save region
		regionservice.saveRegion(theregion);
		return "redirect:/Region/list"; 
	}
}
