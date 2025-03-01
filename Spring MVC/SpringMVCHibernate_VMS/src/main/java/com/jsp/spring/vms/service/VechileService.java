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
		
		mav.setViewName("DisplayAllVechile.jsp");
		mav.addObject("vechileList", vehicles);
		//return frontController
		return mav;
		
	}


	public ModelAndView findvechileId(int vehicleId) {
		vechileReposotiry.findvechileId(vehicleId);
		
		
		ModelAndView mav= new ModelAndView();
		mav.setViewName("updatebyId.jsp");
		mav.addObject("vechileObjectkey",vehicleId);
		return mav;
	}

}
