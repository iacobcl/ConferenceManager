package core;

import java.util.ArrayList;
import java.util.Date;


/**
 * The class defines a Conference. 
 * @since 2026
 * @version 1.0.0
 * @author CI
 */
public class Conference {
	
	/**
	 * Name - name of the conference
	 */
	private String name;
	
	/**
	 * startDate - start date of the conference
	 */
	private Date startDate;
	
	/**
	 * endDate - end date of the conference
	 */
	private Date endDate;
	
	/**
	 * places - country where conference is held
	 */
	public enum places {UK, France, Spain, Italy, Sweden;} 
	
	/**
	 * city - city where conference is held
	 */
	private String city;
	
	/**
	 * prog - list of daily programmes associated with the conference
	 */
	public ArrayList<DailyProgramme> prog;
	
	
	
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
		this.city = city;
		this.prog = prog; 
	}
	
	/**
	 * The method returns the name of a conference
	 * @return String, the name of the conference
	 */
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
