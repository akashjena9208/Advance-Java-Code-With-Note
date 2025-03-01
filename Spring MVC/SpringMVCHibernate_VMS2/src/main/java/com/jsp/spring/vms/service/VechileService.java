package com.jsp.spring.vms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.vms.entity.Vehicle;
import com.jsp.spring.vms.reposotiry.VechileReposotiry;

@Service
public class VechileService {
	@Autowired
	private VechileReposotiry vechileReposotiry;
	

	public ModelAndView addvechile(Vehicle vehicle) {

		// Resolving The Request :-Saving The VechileObject
		vechileReposotiry.saveReposotiry(vehicle);

		// Generating the Response:- Redirecting back to DashBord
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	
	public ModelAndView displayAllVechile()
	{
		//Resolving Request
		List<Vehicle> vehicles=vechileReposotiry.findAllVechile();
		
		//Generating Response
		ModelAndView mav=new ModelAndView();
		//if you not write view throw ciruclarpat exception
		mav.setViewName("DisplayAllVechile.jsp");
		mav.addObject("vechileList", vehicles);
		//return frontController
		return mav;
		
	}


	public ModelAndView findVechileById(int vehicleId) {
		//Resolving Request
		Vehicle vehicle=vechileReposotiry.findVechileById(vehicleId);
		
		ModelAndView mav= new ModelAndView();
		mav.setViewName("UpateVechile.jsp");
		mav.addObject("vechileObject", vehicleId);
		
		return mav;
	}

}
