package com.jsp.hibernate.crud_Criteria;



import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.jsp.hibernate.crud.entity.Student;

public class Fetch_All 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf=cfg.buildSessionFactory();
       Session session=sf.openSession();
       Transaction trn=session.beginTransaction();
       
       //builder object perform different operation
       CriteriaBuilder cb=session.getCriteriaBuilder();
       
       //QueryConstructor
       CriteriaQuery<Student> cq=cb.createQuery(Student.class);
       Root<Student> root= cq.from(Student.class);
       cq.select(root);
       
       
       //condition apply
//       cq.where(cb.equal(root.get("studentName"), "Akash"));
       
       Query<Student> ql=session.createQuery(cq);
       List<Student> list=ql.list();
       for(Student lStudent:list)
       {
    	   System.out.println(list);
       }
      
      
       
       
       
       
       trn.commit();
       sf.close();
       session.close();
     
       
        
        
    }
}
