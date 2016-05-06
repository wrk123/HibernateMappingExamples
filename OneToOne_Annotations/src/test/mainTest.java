package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Person;
import com.PersonDetails;


public class mainTest {

	public static void main(String[] args) {
	 
		
		Configuration cfg=new Configuration();
		cfg.configure("resource/config.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=null;
		try{
			tx=s.beginTransaction();
			/*ADDRESS address=new ADDRESS(0, "OMR Road", "Chennai", "TN", "600097");
			ADDRESS address2=new ADDRESS(1, "BLA VLA Road", "Chennai", "TN", "600097");*/
			
			PersonDetails pd=new PersonDetails();
			pd.setCity("Chennai");
			pd.setState("TN");
			pd.setZipcode("600097");
			
			PersonDetails pd2=new PersonDetails();
			pd2.setCity("Lucknow");
			pd2.setState("UP");
			pd2.setZipcode("221011");
		
			Person p1 = new Person();	
			Person p2 = new Person();
			
			p1.setPersonName("Abhi");
			p2.setPersonName("Manoj");
			p1.setpDetails(pd);
			p2.setpDetails(pd2);
		
			s.save(p1);
			s.save(p2);
			tx.commit();
			
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			s.close();
		}
		
		
		
		
		
	}

}
