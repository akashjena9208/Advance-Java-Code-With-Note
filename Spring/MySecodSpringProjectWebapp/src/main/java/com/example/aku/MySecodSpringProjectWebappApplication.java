
package com.example.aku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.exampule.webapp"})
public class MySecodSpringProjectWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySecodSpringProjectWebappApplication.class, args);
	}

}
