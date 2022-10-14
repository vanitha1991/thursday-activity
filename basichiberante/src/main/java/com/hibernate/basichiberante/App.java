package com.hibernate.basichiberante;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import org.hibernate.Session;
//import org.hibernate.SessionFactory;


//import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
       Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory=cfg.buildSessionFactory();
       
       
    	Session session=factory.openSession();
       
       session.beginTransaction();
       /*Employee e1=new Employee();
      
       e1.setEmpName("anchal");
       e1.setAddress("delhi");
       session.save(e1);
       session.getTransaction().commit();
       session.close();*/
       
      /* Session session1=factory.openSession();
       
       session1.beginTransaction();
       Employee e2=new Employee();
      
       e2.setEmpName("rajan");
       e2.setAddress("manglore");
       session1.save(e2);
       session1.getTransaction().commit();
       session1.close();
       
       Session session2=factory.openSession();
       session2.beginTransaction();
       Employee e3=new Employee();
       e3.setEmpName("rashid");
       e3.setAddress("hassan");
       session2.save(e3);
       session2.getTransaction().commit();
       session2.close();*/
       
       //update
       /*System.out.println("enter id");
       int id=sc.nextInt();
       Employee upemp=session.get(Employee.class, id);
       if(upemp!=null)
       {
    	   sc.nextLine();
       System.out.println("enter the name");
       String name=sc.nextLine();
       System.out.println("enter the address");
       String address= sc.nextLine();
       upemp.setEmpName(name);
       upemp.setAddress(address);
       session.saveOrUpdate(upemp);
       session.getTransaction().commit();
       }
       else
       {
    	   System.out.println("id not found");
       }
       session.close();*/
       
       //delete
       System.out.println("enter id");
       int id=sc.nextInt();
       Employee delemp=session.get(Employee.class, id);
       if(delemp!=null)
       {
    	   session.delete(delemp);
    	   session.getTransaction().commit();
    	   
       }
       else
       {
    	   System.out.println("id not found");
       }
       session.close();
       factory.close();
       
       
       
       
       
       /*Employee emp1=session.get(Employee.class, 6);
       System.out.println(emp1);*/
       //Employee emp1=session.get(Employee.class, 6);  //load
       //System.out.println(emp1.getEmpName());
       //session.close();
       //update
       
       
       
       /*Session session1=factory.openSession();
       session1.beginTransaction();
       Employee e2=new Employee();
       e2.setEmpId(4);
       e2.setEmpName("rajana");
       e2.setAddress("ahmedabad");
       session1.save(e2);
       session1.getTransaction().commit();
       session1.close();*/
        factory.close();
       
        
    }
}
