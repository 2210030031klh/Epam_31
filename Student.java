package klh.com.hibmapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
    @Id
	private int sid;
	private String sname;
	
	@ManyToMany(mappedBy="student")
	private List<Laptop> lp=new ArrayList<Laptop>();
	
	
	public List<Laptop> getLp() {
		return lp;
	}
	public void setLp(List<Laptop> lp) {
		this.lp = lp;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
