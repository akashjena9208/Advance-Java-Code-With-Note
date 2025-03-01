package com.jsp.spring.vms.reposotiry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.jsp.spring.vms.entity.Vehicle;

@Repository
public class VechileReposotiry {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");

	public void saveReposotiry(Vehicle vehicle) {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(vehicle);
		et.commit();
		em.close();

	}

	public List<Vehicle> findAllVechile() {

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		/*
		 * Query query=em.createQuery("From Vehicle"); List<Vehicle> v =
		 * query.getResultList();
		 */

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Vehicle> cq = cb.createQuery(Vehicle.class);

		Root<Vehicle> root = cq.from(Vehicle.class);
		cq.select(root);

		Query query = em.createQuery(cq);
		List<Vehicle> v = query.getResultList();

		et.commit();
		em.close();
		return v;
	}

	public Vehicle findvechileId(int vehicleId) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Vehicle vehicle = em.find(Vehicle.class, vehicleId);
		
		et.commit();
		em.close();
		return vehicle;

	}

}
