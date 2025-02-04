package com.jsp.hibernate.crud_Using_NativeSQL;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.jsp.hibernate.crud.entity.Student;

public class Fetch_App 
{
    public static void main( String[] args )
    {
        
        
        
        Configuration cfg= new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
        
       NativeQuery<Student> nq =session.createNativeQuery("Select * from Student", Student.class);
       List<Student> lStudents=nq.list();
       
       for(Student s:lStudents)
       {
    	   System.out.println(s);
       }
        
      
        
   
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
