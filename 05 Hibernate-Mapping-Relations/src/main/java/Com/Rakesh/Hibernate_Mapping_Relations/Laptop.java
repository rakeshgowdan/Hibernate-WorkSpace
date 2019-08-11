package Com.Rakesh.Hibernate_Mapping_Relations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int lid;
	private String lname;
	
	/*@ManyToOne
	private StudentDB student;
	public StudentDB getStudent() {
		return student;
	}
	public void setStudent(StudentDB student) {
		this.student = student;
	}*/
	@ManyToMany
	private List<StudentDB> student=new ArrayList<StudentDB>();
	
	public List<StudentDB> getStudent() {
		return student;
	}
	public void setStudent(List<StudentDB> student) {
		this.student = student;
	}
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
	

}
