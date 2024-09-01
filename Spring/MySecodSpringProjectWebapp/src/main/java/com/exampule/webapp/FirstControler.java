package com.exampule.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstControler 
{
	@GetMapping
	public String getHelloWorld()
	{
		return "Hello Akash your 1st server search using get used localhost:8080";
	}
	
	//localhost:8080/search
	@GetMapping("search")
	public String getSearchrch()
	{
		return "Akash your 1st server search using get used:- localhost:8080/search";
	}
	//localhost:8080/searching?q=aksh
	@GetMapping("searching")
	public String keyValuee(@RequestParam(name="q") String value)
	{
		return value;
	}
	//localhost:8080/searching/akshjena
	@GetMapping("searching/{akash}")
	public String pathkeyValuee(@PathVariable(name="akash") String value)
	{
		return value;
	}

	//localhost:8080/post
	@PostMapping(path = "post")
	public void postkoro()
	{
		System.out.println("Yore post sucessfull");
	}
}
