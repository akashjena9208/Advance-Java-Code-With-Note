package org.example;

import com.jsp.hibernate.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Student s= new Student();
        s.setStudenAge(23);
        s.setStudentId(1);
        s.setStudentName("chan");

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("mysql-config");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();

        et.begin();
        em.persist(s);
        et.commit();



    }
}
