package core;
import java.util.Date;

import storage.DatabaseManager;

public class Talk {
	
	private String title;
	private User author;
	private Date slot;
	private Location room;
	
	
	
	//Constructors
	public Talk() {
		super();
		this.title = new String();
		this.author = new User();
		this.slot = new Date();
		this.room = new Location();
	}
	
	public Talk(String title, User author, Date slot, Location room) {
		super();
		this.title = title;
		this.author = author;
		this.slot = slot;
		this.room = room;
	}
	
	//Getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	public Date getSlot() {
		return slot;
	}
	public void setSlot(Date slot) {
		this.slot = slot;
	}
	public Location getRoom() {
		return room;
	}
	public void setRoom(Location room) {
		this.room = room;
	}
	
	public void addTalkToDb()
	{
		DatabaseManager db = new DatabaseManager();
		db.addTalk(this);
		
	}

	
}
