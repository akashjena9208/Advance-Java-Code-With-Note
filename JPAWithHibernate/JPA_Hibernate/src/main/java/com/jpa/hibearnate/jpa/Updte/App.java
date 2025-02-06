package com.jpa.hibearnate.jpa.Updte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.hibearnate.jpa.entity.Car;

public class App 
{
    public static void main( String[] args )
    {

    	//this fellow work both read and build the structure 
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
        
        //This Fellow Provide a Method just like Session
        EntityManager em=emf.createEntityManager();
        
        //
        EntityTransaction et=em.getTransaction();
        et.begin();
        
        
        //Upadte
        //First Fetch then Update
        Car c=em.find(Car.class, 101);
        //update
        c.setCarPrice(5000);
        em.merge(c);
        
        
        et.commit();
        em.close();
        emf.close();
        
        
    }
}
