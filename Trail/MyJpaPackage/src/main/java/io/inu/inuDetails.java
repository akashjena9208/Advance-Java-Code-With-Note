package io.inu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class inuDetails {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		inu i= new inu();
		
		i.setFirstname("Smruti");
		i.setLastname("Nayak");
		i.setAge(21);
		
		EntityManagerFactory  entityManagerFactory=Persistence.createEntityManagerFactory("akash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(i);
		entityTransaction.commit();
		

	}

}
