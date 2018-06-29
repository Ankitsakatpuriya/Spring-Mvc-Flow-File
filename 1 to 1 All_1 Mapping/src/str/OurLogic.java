package str;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class OurLogic {
 
 public static void main(String args[])
 {
 
 Configuration cfg = new Configuration();
 cfg.configure("hibernate.cfg.xml"); 
 
 SessionFactory factory = cfg.buildSessionFactory();
 Session session = factory.openSession(); 
 Transaction tx = session.beginTransaction();
 //-----Select-----------------------------------------------------------------
 
 
/* 
 Object o = session.get(Address.class,509);
 Address a = (Address)o;
 System.out.println(a.getCity());

 Student s=a.getS();
 System.out.println(s.getStudentName());
 
 
 }}
 */
 
 
 //------------------------Update--------------------------------------------	
 Object o = session.get(Address.class,509);
 Address a = (Address)o;
 System.out.println(a.getCity());

 Student s=a.getS();
 
 s.setStudentName("ram");
 System.out.println(s.getStudentName());

 a.setS(s);
 session.update(a);

 tx.commit();
session.close();





}}
 //---------Create--------------------------------------------------------------------------
 
 /*Student s=new Student();
 s.setStudentId(509);
 s.setStudentName("Ankit");
 
 Address ad = new Address();
 ad.setAddressId(509);
 ad.setCity("Itarsi");
 ad.setState("MP");
 ad.setS(s); 
 

 
     session.save(ad);
 
     tx.commit();
 
     session.close();
     System.out.println("One to One is Done..!!");
     factory.close();
 
 }
}
*/