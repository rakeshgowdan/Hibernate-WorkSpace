package Com.Rakesh.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

//Bean or Pojo Class
@Entity
public class Employee {
	@Id
	private int id;
	private String Fname;
	private String Lname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}

}
