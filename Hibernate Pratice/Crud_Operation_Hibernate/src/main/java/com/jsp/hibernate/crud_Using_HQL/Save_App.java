package com.jsp.hibernate.crud_Using_HQL;



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
        
        Student student1=new Student();
        student1.setStudentId(102);
        student1.setStudentName("Subha");
        student1.setStudentAge(30);
        
        Student student2=new Student();
        student2.setStudentId(103);
        student2.setStudentName("Kumar");
        student2.setStudentAge(15);
        
        Student student3=new Student();
        student3.setStudentId(107);
        student3.setStudentName("Depaak");
        student3.setStudentAge(55);


        Student student4=new Student();
        student4.setStudentId(104);
        student4.setStudentName("Himu");
        student4.setStudentAge(60);
        
        Student student5=new Student();
        student5.setStudentId(105);
        student5.setStudentName("Kajal");
        student5.setStudentAge(85);
        
        Student student6=new Student();
        student6.setStudentId(106);
        student6.setStudentName("Docotor");
        student6.setStudentAge(95);
        
        
        Configuration cfg= new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        SessionFactory sf= cfg.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trn=session.beginTransaction();
        
        session.save(student);
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        session.save(student5);
        session.save(student6);
        
        
        
        trn.commit();
        session.close();
        sf.close();
        
        
    }
}
