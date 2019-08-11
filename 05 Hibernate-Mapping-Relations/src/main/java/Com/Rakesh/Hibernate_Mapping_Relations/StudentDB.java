package Com.Rakesh.Hibernate_Mapping_Relations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class StudentDB {
	@Id
	private int roolNo;
	private String Name;
	private int marks;
//	@OneToOne 
//	private Laptop laptop;
/*	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	  
/*	@OneToMany(mappedBy = "student")
	private List<Laptop>laptop=new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}*/
	@ManyToMany(mappedBy = "student")
	private List<Laptop>laptop=new ArrayList<Laptop>();
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDB [roolNo=" + roolNo + ", Name=" + Name + ", marks=" + marks + "]";
	}
 
}
