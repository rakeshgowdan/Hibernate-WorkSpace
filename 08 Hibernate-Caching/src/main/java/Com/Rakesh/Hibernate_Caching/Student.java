package Com.Rakesh.Hibernate_Caching;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	private int eid;
	private String Name;
	private String Address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Student() {
		
	}
	public Student(int eid, String name, String address) {
	
		this.eid = eid;
		Name = name;
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", Name=" + Name + ", Address=" + Address + "]";
	} 

}
