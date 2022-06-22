package one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int gstnumber;
	private String state;
	private	String country;
	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getGstnumber() {
		return gstnumber;
	}



	public void setGstnumber(int gstnumber) {
		this.gstnumber = gstnumber;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}


	
	
}
