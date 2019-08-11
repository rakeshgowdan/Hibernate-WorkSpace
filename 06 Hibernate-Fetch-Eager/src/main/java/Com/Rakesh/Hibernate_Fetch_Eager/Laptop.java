package Com.Rakesh.Hibernate_Fetch_Eager;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	
	@Id
	private int lid;
	private String lname;
	
	@ManyToOne
	private StudentDB student;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public StudentDB getStudent() {
		return student;
	}

	public void setStudent(StudentDB student) {
		this.student = student;
	}
	
}
