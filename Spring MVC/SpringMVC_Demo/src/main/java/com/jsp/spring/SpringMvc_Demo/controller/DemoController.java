package com.jsp.spring.SpringMvc_Demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@RequestMapping("/example")
	public ModelAndView print(int userId,String userName)
	{
		ModelAndView mav=new ModelAndView();
		//Send to View or Ui
		mav.setViewName("output.jsp");
		mav.addObject("key1",userId);
		mav.addObject("key2",userName);
		
		return mav;
		
	}

}
