package Com.Rakesh.Hibernate_Fetch_Lazy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class App 
{
    public static void main( String[] args )
    {
        
    	Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(StudentDB.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	
    	s.beginTransaction();
    	
    	StudentDB s1=(StudentDB) s.get(StudentDB.class, 1);
    	System.out.println(s1.getName());
    	
    	
    	
    	
    }
}
