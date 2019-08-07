package Com.Rakesh.HibernateFetchValuesFromDB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student();
       
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	
    	
    	
    	
    	
    	s1=(Student)s.get(Student.class, 1002);
    	
    	
    	System.out.println(s1);
    }
}
