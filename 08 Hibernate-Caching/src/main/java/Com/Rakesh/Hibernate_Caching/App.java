package Com.Rakesh.Hibernate_Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class App 
{
    public static void main( String[] args )
    {
    	Student s1=null;
        
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
    	
    	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(sr);
    	Session session1=sf.openSession();
    	/*
    	 * FisrtLevel Cache
    	s1=(Student)session1.get(Student.class, 1002);
    	System.out.println(s1); 
    	session1.getTransaction().commit();
    	session1.close();
    	//second time it checks value in first level cache then check in second level cache , if not DB
    	s1=(Student)session1.get(Student.class, 1002);
    	System.out.println(s1); 
    */
    	//Second level cache
    	
    	//first session
    	s1=(Student)session1.get(Student.class, 1002);
    	System.out.println(s1); 
    	
    /*	session1.getTransaction().commit();
    	session1.close();
    	*/
    	//second session
    	
    	Session session2=sf.openSession();
    	session2.beginTransaction();
    	
    	s1=(Student)session1.get(Student.class, 1002);
    	System.out.println(s1); 
    /*	session2.getTransaction().commit();
    	session2.close();
    */}
}
