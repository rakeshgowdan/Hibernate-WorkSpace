package Com.Rakesh.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    
       Employee e1=new Employee();
       e1.setId(10001);
       e1.setFname("Alien");
       e1.setLname("Alien");
       
       //Persist Data- move to DB
       Configuration config=new Configuration().configure().addAnnotatedClass(Employee.class);
       //Deprecated
       SessionFactory sf=config.buildSessionFactory();
       
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       	session.save(e1);
       	tx.commit();
       	sf.close();
       	session.close();
       	
    }
}
