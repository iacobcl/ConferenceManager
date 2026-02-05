package storage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import core.Talk;
import core.User;


public class DatabaseManager {
	
	public void addTalk(Talk t)
	{

	    String url = "jdbc:sqlite:conf.db";
	        
        try (Connection conn = DriverManager.getConnection(url)) {
        	
            if (conn != null) {
                String sql = new String("INSERT INTO Talks (title, author) VALUES (?, ?)");
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
	
	public ArrayList<Talk> viewAllTalks()
	{

	    String url = "jdbc:sqlite:conf.db";
	    ArrayList<Talk> talks = new ArrayList<Talk>();
	        
        try (Connection conn = DriverManager.getConnection(url)) {
        	
            if (conn != null) {
                String sql = new String("SELECT * FROM Talks");
                PreparedStatement ps = conn.prepareStatement(sql);
                
                ResultSet rs = ps.executeQuery();
               
                
                while (rs.next()) {
                	Talk t = new Talk();
                	t.setAuthor(new User(rs.getString("author")));
                	t.setTitle(rs.getString("title"));
                	talks.add(t);
                }
                
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return talks;

	}

    public static void main(String[] args) {
    
 	        DatabaseManager db = new DatabaseManager();
 	        
 	        User author = new User();
 	        author.setName("John");
 	        Talk talk = new Talk();
 	        talk.setAuthor(author);
 	        talk.setTitle("New software");
 	        
 	        db.addTalk(talk);

 	        ArrayList<Talk> talks = db.viewAllTalks();
 	        
 	        for (int i=0; i<talks.size(); i++)
 	        {
 	        	System.out.println(talks.get(i).getTitle() + "   " + talks.get(i).getAuthor().getName());
 	        }
 	        

 	        
    }
}