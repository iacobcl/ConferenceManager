package core;

import java.util.ArrayList;
import java.util.Date;



public class Conference {
	
	private String name;
	private Date startDate;
	private Date endDate;
	public enum places {UK, France, Spain, Italy, Sweden;} 
	private String country; 
	private String city;
	private ArrayList<DailyProgramme> prog;
	
	
	
	//Constructors
	public Conference() {
		super();
		this.name = new String();
		this.startDate = new Date();
		this.endDate = new Date();
		this.city = new String();	
		this.prog = new ArrayList<DailyProgramme>();
	}
	public Conference(String name, Date startDate, Date endDate, String country, String city, ArrayList<DailyProgramme> prog) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.country = country;
		this.city = city;
		this.prog = prog; 
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	

}
