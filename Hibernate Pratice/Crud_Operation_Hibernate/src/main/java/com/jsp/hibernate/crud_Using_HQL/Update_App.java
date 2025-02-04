package com.jsp.hibernate.crud_Using_HQL;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate.crud.entity.Student;

public class Update_App 
{
    public static void main( String[] args )
    {
        
        
        Configuration cfg= new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
        
        Query<Student> query=session.createQuery("UPDATE Student s SET s.studentName='Subha' WHERE s.studentId=101");
        int rowUpdate=query.executeUpdate();
        System.out.println(rowUpdate);
        
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
