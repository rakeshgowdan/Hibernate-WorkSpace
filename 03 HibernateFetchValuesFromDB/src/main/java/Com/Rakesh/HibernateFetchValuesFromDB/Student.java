package Com.Rakesh.HibernateFetchValuesFromDB;

import javax.persistence.Entity;
import javax.persistence.Id;

//bean or pojo class

@Entity
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
	@Override
	public String toString() {
		return "Student [eid=" + eid + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	
}
