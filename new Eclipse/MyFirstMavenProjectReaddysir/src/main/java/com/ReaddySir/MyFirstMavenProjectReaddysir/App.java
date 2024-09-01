package com.ReaddySir.MyFirstMavenProjectReaddysir;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Student st=new Student();
       st.setName("Akash Jena");
       st.setBranch("CST");
       st.setRoll(2001289215);
       

       
       //configuration object need,hibernet.xml.are given the data,
       Configuration configuration= new Configuration().configure().addAnnotatedClass(Student.class);
       //session open time essionFactory object need
       SessionFactory sessionFactory=configuration.buildSessionFactory();
       //essionFactory open time
       Session session=sessionFactory.openSession();
       //session save so used transaction
       Transaction transaction=session.beginTransaction();
       
       session.save(st);
       transaction.commit();
       
       System.out.println(st);
       
       
    }
}
