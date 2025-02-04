package com.jsp.hibernate.crud_Criteriabuilder;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.jsp.hibernate.crud.entity.Student;

public class Fetch_App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf=cfg.buildSessionFactory();
       Session session=sf.openSession();
       Transaction trn=session.beginTransaction();
       
       
       Criteria criteria=session.createCriteria(Student.class);
       List<Student> l=criteria.list();
       for(Student s:l)
       {
    	   System.out.println(s);
       }
       
       System.out.println();
       //condition apply that time use restriction
     
       criteria.add(Restrictions.eq("studentId", 101));
       
       List<Student> lp=criteria.list();
       for(Student s:lp)
       {
    	   System.out.println(s);
       }
       
       
       
       trn.commit();
       sf.close();
       session.close();
     
       
        
        
    }
}
