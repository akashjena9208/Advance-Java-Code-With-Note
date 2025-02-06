package com.jpa.hibearnate.jpa.Add;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.hibearnate.jpa.entity.Car;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Car c1=new Car();
    	c1.setCarInt(101);
    	c1.setCarBrand("BMW");
    	c1.setCarName("BMW X");
    	c1.setCarPrice(10000000);
    	
    	
    	Car c2=new Car();
    	c2.setCarInt(102);
    	c2.setCarBrand("Toyata");
    	c2.setCarName("AX5");
    	c2.setCarPrice(90000000);
    	
    	
    	
    	Car c3=new Car();
    	c3.setCarInt(103);
    	c3.setCarBrand("Audi");
    	c3.setCarName("Nexa");
    	c3.setCarPrice(950000000);
    	
    	
    	
    	
    	Car c=new Car();
    	c.setCarInt(104);
    	c.setCarBrand("Tata");
    	c.setCarName("Neo");
    	c.setCarPrice(80000000);
    	
    
    	
    	
    	//this fellow work both read and build the structure 
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
        
        //This Fellow Provide a Method just like Session
        EntityManager em=emf.createEntityManager();
        
        //
        EntityTransaction et=em.getTransaction();
        et.begin();
        
        //Add
        em.persist(c);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
       
        
        
        et.commit();
        em.close();
        emf.close();
        
        
    }
}
