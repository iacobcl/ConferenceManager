package core;

import java.util.ArrayList;
import java.util.Date;

public class DailyProgramme {
	
	private ArrayList<Talk> talks;
	private Conference conf;
	private Date day;
	
	
	
	public DailyProgramme() {
		super();
		talks = new ArrayList<Talk>();
		conf = new Conference();
		day = new Date();
	}

	public DailyProgramme(ArrayList<Talk> talks, Conference conf, Date day) {
		super();
		this.talks = talks;
		this.conf = conf;
		this.day = day;
	}

	public ArrayList<Talk> getTalks() {
		return talks;
	}

	public void setTalks(ArrayList<Talk> talks) {
		this.talks = talks;
	}

	public Conference getConf() {
		return conf;
	}

	public void setConf(Conference conf) {
		this.conf = conf;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}
	
	
	public void addTalkToProgramme(Talk t)
	{
		this.talks.add(t);
	}
	

}
