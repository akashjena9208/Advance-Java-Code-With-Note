package com.jsp.hibernate.crud_Using_InBulidMethod;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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
        
        
//        Student  student=session.get(Student.class, 101);
//        System.out.println(student);
        
        
        //or
        
//        
//        Student  student=session.load(Student.class, 101);
//        System.out.println(student);
        
      
        
   
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
