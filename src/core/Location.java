package core;


/**
 * The class defines a Location. 
 * @since 2026
 * @version 1.0.0
 * @author CI
 */
public class Location {
	
	private String building;
	private int floor;
	private String room;
	private String postcode;
	
	
	public Location() {
		super();
		this.building = new String();
		this.floor = 0;
		this.room = new String();
		this.postcode = new String();
	}

	
	public Location(String building, int floor, String room, String postcode) {
		super();
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.postcode = postcode;
	}
	
	

	//Getter and setters
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	

}
