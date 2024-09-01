package com.example.aku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(MyFirstSpringProjectApplication.class, args);
		
		//one bike create multiple work
//		bike bike1= new bike();
//		engine engine1=new engine();
//		bike1.setEngi(engine1);
		
		bike bike1=context.getBean(bike.class);
		//spring object call , inside contain object call
		System.out.println(bike1.getName());
		System.out.println("...................");
		
		bike bike2=context.getBean(bike.class);
		System.out.println(bike2);
		System.out.println("...................");
		
		
		bike bike3=context.getBean(bike.class);
		System.out.println(bike3.getColor());
		//which engine
		System.out.println(bike3.getEngi().getModel());
		System.out.println(bike1.getEngi().getCc());
			
		
		
		

		
		
		
		
	}

}
