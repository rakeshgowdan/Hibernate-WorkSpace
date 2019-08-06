package Com.Rakesh.HibernateAutoTableCreation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Student s1=new Student();
    	s1.setEid(1002);
    	s1.setName("Rakesh");
    	s1.setAddress("Earth");
  
    	Configuration cf= new Configuration().configure().addAnnotatedClass(Student.class);
    	//After 4.1 new Method)
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cf.getProperties()).buildServiceRegistry();
    	
    	SessionFactory sf=cf.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	
    	Transaction t=session.beginTransaction();
    	
    	session.save(s1);
    	
    	t.commit();
    	
    	
    }
}
