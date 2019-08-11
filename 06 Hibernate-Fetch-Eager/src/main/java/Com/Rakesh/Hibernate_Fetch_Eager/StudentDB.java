package Com.Rakesh.Hibernate_Fetch_Eager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentDB {
	
	@Id
	private int roolNo;
	private String name;
	
	@OneToMany(mappedBy = "student",fetch = FetchType.EAGER)
	private List<Laptop> laps=new ArrayList<Laptop>();

	

	public int getRoolNo() {
		return roolNo;
	}

	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}
	
	

}
