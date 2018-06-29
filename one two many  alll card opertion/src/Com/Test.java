package Com;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {

		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
		State v =new State();
		            
		            v.setId(1);
		            v.setStatename("MP");
		            
		            
		            
		 School c1=new School();
		             
		  c1.setSid(301);
		  c1.setSchoolname("MODERN");
		  c1.setFid(1);         
		 c1.setSchoolcity("itarsi");
		  School c2=new School();
		             
		 c2.setFid(1);
         c2.setSchoolname("TEGOR");
         c2.setSid(302);
         c2.setSchoolcity("itarsi");
         School c3=new School();
         c3.setFid(1);
         c3.setSchoolname("SRSWATI");
         c3.setSid(303);
         c3.setSchoolcity("itarsi");
         Set s=new HashSet();
		  
				        s.add(c1);
				        s.add(c2);
				        s.add(c3);
		        
		        
		              v.setChildern(s);
		              
		    Transaction tx = session.beginTransaction();
		                
		                      session.save(v);
		                     
		    tx.commit();
		    session.close();
		    System.out.println("One To Many is Done..!!");
		    factory.close();

	}

}
