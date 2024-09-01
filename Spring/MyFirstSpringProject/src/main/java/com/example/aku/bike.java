package com.example.aku;

import javax.print.attribute.standard.MediaSize.Engineering;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//object automatic create using Component 
//bean or factory
@Component
//same object everytime used singleton its bydefult or different different object
@Scope("prototype")
public class bike 
{
	private String name="Yamaha MT15";
	private  String color=" Cyan Storm";
//engine inject the bike,bcz bike depends the engine 	
	@Autowired
	private engine engi;
	
	public engine getEngi() {
		return engi;
	}
	public void setEngi(engine engi) {
		this.engi = engi;
	}
	
	
	//constractor
	
	public bike()
	{
		System.out.println("making a constractor");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	

}
