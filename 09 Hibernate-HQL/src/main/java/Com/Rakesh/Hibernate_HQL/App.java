package Com.Rakesh.Hibernate_HQL;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {

    	
    	Configuration c=new Configuration().configure().addAnnotatedClass(Worker.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(c.getProperties()).buildServiceRegistry();
    	SessionFactory sf=c.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	s.beginTransaction();
    	
    	/*Random r=new Random();
    	for(int i=1;i<20;i++) {
    		Worker w= new Worker();
    		w.setWid(i);
    		w.setName("name"+i);
    		w.setSalary(r.nextInt(100000));
    		s.save(w);
    	}*/
    	
    	Query q=s.createQuery("from Worker ");
    	List<Worker> l=q.list();
    	
    	for(Worker w:l) {
    		System.out.println(w);
    	}
    	
    	s.getTransaction().commit();
    	
    }
}
