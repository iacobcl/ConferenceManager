package core;

import java.util.ArrayList;

public class User {
	
	private String name;
	private boolean presents;
	private String affiliation;
	private ArrayList<DailyProgramme> progs;
	
	
	//Constructors
	public User() {
		super();
		this.name = new String();
		this.presents = false;
		this.affiliation = new String();
		this.progs = new ArrayList<DailyProgramme>();
	}

	public User(String name)
	{
		super();
		this.name = name;
	}

	public User(String name, boolean presents, String affiliation, ArrayList<DailyProgramme> progs) {
		super();
		this.name = name;
		this.presents = presents;
		this.affiliation = affiliation;
		this.progs = progs;
	}


	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isPresents() {
		return presents;
	}


	public void setPresents(boolean presents) {
		this.presents = presents;
	}


	public String getAffiliation() {
		return affiliation;
	}


	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}


	public ArrayList<DailyProgramme> getProgs() {
		return progs;
	}


	public void setProgs(ArrayList<DailyProgramme> progs) {
		this.progs = progs;
	}
	

	public void addProgToUser(DailyProgramme day) {
		progs.add(day);
	}

}
