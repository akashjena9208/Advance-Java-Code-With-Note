package com.jsp.spring.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.vms.entity.Vehicle;
import com.jsp.spring.vms.service.VechileService;

@Controller
public class VechileController {
	@Autowired
	private VechileService vechileService;
	
	@RequestMapping(value = "/add-vehicle",method = RequestMethod.POST)
	public ModelAndView addvechile(Vehicle vehicle)
	{
		return vechileService.addvechile(vehicle);
		
	}
	
	@RequestMapping(value = "/display-all-vehicle",method = RequestMethod.GET)
	public ModelAndView displayAllVechile()
	{
		return vechileService.displayAllVechile();
		
	}
	
	@RequestMapping(value = "/find-by-id",method = RequestMethod.GET)
	public ModelAndView findVechileById(int vehicleId)
	{
		return vechileService.findVechileById(vehicleId);
		
	}
	
	
	
	
	

}
