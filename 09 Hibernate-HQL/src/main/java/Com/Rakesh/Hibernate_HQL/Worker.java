package Com.Rakesh.Hibernate_HQL;

import javax.persistence.*;

@Entity
public class Worker {

	@Id
	int wid;
	String name;
	int salary;
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [wid=" + wid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
