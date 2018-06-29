package Com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		// select all 
		 Query qry=s.createQuery("from Student c");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      Object o = it.next();
	      Student c = (Student)o;
	      System.out.println(c.getSname());
	      Teacher v=c.getSobject();
	      System.out.println(v.getTname());
	     }
	 
	     s.close();
	     System.out.println("many to one select done..!!");
	     sf.close();       
	 
	 }
	}
		// select
		/*Object o = s.get(Student.class,101);		 
		Student c = (Student)o;
		
		System.out.println(c.getSid());
		Teacher v=c.getSobject();
		System.out.println(v.getTname()); 
		
		
		    s.close();
		    System.out.println("many to one delete done..!!");
		    sf.close();       

	}}
		*/
		/*
		Teacher v = new Teacher();
		v.setTid(1);
		v.setTname("Neeraj Sir");
		
		Student c = new Student();
		c.setSid(101);
		c.setSname("Ankit");
		c.setSobject(v);
		
		
		Student c1 = new Student();
		c1.setSid(102);
		c1.setSname("Prshant");
        c1.setSobject(v);
		
		Student c3 = new Student();
		c3.setSid(103);
		c3.setSname("OM");
		c3.setSobject(v);
	
		Student c4 = new Student();
		c4.setSid(104);
		c4.setSname("Priya");
	    c4.setSobject(v);

     Transaction tx = s.beginTransaction();
     
		s.save(c);
		s.save(c1);
		
		s.save(c3);
		s.save(c4);
		
		
	tx.commit();
	s.close();
    System.out.println("One To Many is Done..!!");
    sf.close();
	}


	}*/


