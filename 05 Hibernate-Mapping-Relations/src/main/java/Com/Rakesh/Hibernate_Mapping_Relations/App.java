package Com.Rakesh.Hibernate_Mapping_Relations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
      
    	Laptop l1=new Laptop();
    	l1.setLid(101);
    	l1.setLname("Dell");
    	
    	
    	StudentDB s1=new StudentDB();
    	s1.setRoolNo(1);
    	s1.setName("Alien");
    	s1.setMarks(88);
    //for one to one
    	//	s1.setLaptop(l1);
    	
    //one to many
    //ManytoOne
    	//manytoMany
    s1.getLaptop().add(l1);
    
    //ManyToMany-laptop
    l1.getStudent().add(s1);
    
    
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(StudentDB.class);
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session s=sf.openSession();
    	
    	s.beginTransaction();
    	
    	s.save(l1);
    	s.save(s1);
    	
    	s.getTransaction().commit();
    	
    	
    }
}
