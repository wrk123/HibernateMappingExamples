package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.College;
import com.Student;



public class mainTest {

	public static void main(String[] args) {
	 
		
		Configuration cfg=new Configuration();
		cfg.configure("resource/config.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction tx=null;
		try{
			tx=s.beginTransaction();
			
			College col=new College();
			col.setCollegeName("Gogte");
			
			Student st=new Student();
			st.setStudentName("Ankita");
			
			Student st2=new Student();
			st2.setStudentName("Nikita");
			
			st.setCollege(col);
			st2.setCollege(col);
			
			s.save(col);
			s.save(st);
			s.save(st2);
		
			tx.commit();
			
		}catch(Exception e){
			tx.rollback();
			e.printStackTrace();
		}finally{
			s.close();
		}
		
		
		
		
		
	}

}
