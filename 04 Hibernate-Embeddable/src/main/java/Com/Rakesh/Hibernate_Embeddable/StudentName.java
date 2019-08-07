package Com.Rakesh.Hibernate_Embeddable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	
	private String Fname;
	private String lname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "StudentName [Fname=" + Fname + ", lname=" + lname + "]";
	}

}
