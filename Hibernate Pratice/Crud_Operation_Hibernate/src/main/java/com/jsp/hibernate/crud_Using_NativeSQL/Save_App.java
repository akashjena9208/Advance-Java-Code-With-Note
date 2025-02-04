package com.jsp.hibernate.crud_Using_NativeSQL;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.crud.entity.Student;

public class Save_App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student student=new Student();
        student.setStudentId(101);
        student.setStudentName("Akash");
        student.setStudentAge(25);
        
        
        Configuration cfg= new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
        session.save(student);
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
