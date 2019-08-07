package Com.Rakesh.Hibernate_Embeddable;

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
       StudentName s1=new StudentName();
       s1.setFname("aaaa");
       s1.setLname("bbbb");
       
       StudentInfo s2=new StudentInfo();
       s2.setEid(100003);
       s2.setName(s1);
       s2.setAddress("cccc");
       
       
       Configuration cf=new Configuration().configure().addAnnotatedClass(StudentInfo.class);
       
    ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(cf.getProperties()).buildServiceRegistry();
   	SessionFactory sf=cf.buildSessionFactory(sr);
   	Session s=sf.openSession();
    Transaction t=s.beginTransaction();
	s.save(s2);
   	t.commit();
   
    	
    }
}
