package com.jpa.hibearnate.actor_movie.dao;


import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.hibearnate.actor_movie.entity.Actor;

public class ActorDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	Scanner sc = new Scanner(System.in);

	public void addActor() {

		Actor actor = new Actor();
		System.out.println("Enter Actor Id");
		actor.setActorId(sc.nextInt());
		System.out.println("Enter Actor name");
		actor.setActorName(sc.next());
		System.out.println("Enter Actor Age");
		actor.setActorAge(sc.nextInt());
		System.out.println("Enter Actor Salary");
		actor.setSalary(sc.nextInt());
		System.out.println("Enter Actor industry");
		actor.setIndustry(sc.next());
		System.out.println("Enter  Actor Nationality");
		actor.setNationality(sc.next());

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(actor);

		et.commit();
		em.close();
		emf.close();

	}
	
	
	
	public void findActorById()
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		System.out.println("Enter Actor id ");
		Actor aid=em.find(Actor.class, sc.nextInt());
		
		if(aid!=null)
		{
			System.out.println(aid);
			et.commit();
			em.close();
			emf.close();
		}
		else
		{
			System.out.println();
			System.err.println("\n Actor Id Is Not preasnt");
		}
		
		
		
		
	}
	
	
	
	public void findAllActorByName()
	{
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		
		Query query=em.createQuery("Select a from Actor a where a.actorName ?");
		System.out.println("Enter Actor Name");
		query.setParameter(1, sc.next());
		  List<Actor> actorsList=query.getResultList();
			        for(Actor actor:actorsList)
			        {
			        	System.out.println(actor);
			        	System.out.println("Actor Name :- "+actor.getActorName());
			        }
		
			        
		
		
//		if(aname!=null)
//		{
//			System.out.println(aid);
//			et.commit();
//			em.close();
//			emf.close();
//		}
//		else
//		{
//			System.out.println();
//			System.err.println("\n Actor Id Is Not preasnt");
//		}
		
		
		
		
	}

}
