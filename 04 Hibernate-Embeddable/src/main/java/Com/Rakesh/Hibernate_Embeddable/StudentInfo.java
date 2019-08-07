package Com.Rakesh.Hibernate_Embeddable;

import javax.persistence.Entity;
import javax.persistence.Id;

//bean or pojo class

@Entity
public class StudentInfo {

	@Id
	private int eid;
	private StudentName Name;
	private String Address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public StudentName getName() {
		return Name;
	}
	public void setName(StudentName name) {
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
