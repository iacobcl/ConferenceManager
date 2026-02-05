package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import core.Talk;
import core.User;


public class DatabaseManager {
	
	public void addTalk(Talk t)
	{

	    String url = "jdbc:sqlite:conf.db";
	        
        try (Connection conn = DriverManager.getConnection(url)) {
        	
            if (conn != null) {
                String sql = new String("INSERT INTO talks (title, author) VALUES (?, ?)");
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ps.setString(1, t.getTitle());               
                ps.setString(2, t.getAuthor().getName());
                
                ps.executeUpdate();
                System.out.println("Saved");
                
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }

	}

    public static void main(String[] args) {
    
 	        DatabaseManager db = new DatabaseManager();
 	        
 	        User author = new User();
 	        author.setName("John");
 	        Talk talk = new Talk();
 	        talk.setAuthor(author);
 	        talk.setTitle("New software");
 	        
 	        db.addTalk(talk);

    
    }
}