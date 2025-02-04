package com.jsp.hibernate.crud_Using_NativeSQL;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.jsp.hibernate.crud.entity.Student;

public class Delete_App 
{
    public static void main( String[] args )
    { 
        Configuration cfg= new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
      
        NativeQuery<Student> nquery=session.createNativeQuery("DELETE FROM Student  WHERE studentId=101");
        int rowdelete=nquery.executeUpdate();
        System.out.println(rowdelete);
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
