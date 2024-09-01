package com.example.aku;

import org.springframework.stereotype.Component;

@Component
public class engine 
{
	private String cc="200cc";
	private String model="Bs6";
	
	
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	

}
