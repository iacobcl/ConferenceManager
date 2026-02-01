package operations;

import java.util.ArrayList;
import java.util.Date;

import core.Conference;
import core.DailyProgramme;
import core.Location;
import core.Talk;
import core.User;

public class Demo {
	
	
	Conference testConf = new Conference();
	User testAuthor1 = new User();
	User testAuthor2 = new User();
	
	User testParticipant = new User();
	
	ArrayList<DailyProgramme> testProg = new ArrayList<DailyProgramme>();
	
	ArrayList<DailyProgramme> testUserProg = new ArrayList<DailyProgramme>();
	
	
	Location testLocation1 = new Location();
	Location testLocation2 = new Location();
	
	Talk testTalk1 = new Talk();
	Talk testTalk2 = new Talk();
	Talk testTalk3 = new Talk();
	Talk testTalk4 = new Talk();
		
	
	
	public Demo()
	{
		//create a conference
		testConf = new Conference("Software Engineering 2026", new Date(2026, 06, 01), new Date(2026, 06, 05), Conference.places.France.toString(), "Lyon", testProg);

		
		
		//create some authors
		testAuthor1 = new User("John Smith", true, "UoP", null);
		testAuthor2 = new User("Jane Davis", true, "UCL", null);

		
		
		//create my test locations for my talks
		testLocation1 = new Location("Limonade", 2, "Green Room", "12345");
		testLocation2 = new Location("Marie Curie", 4, "Yellow Room", "54321");
		
		
		
		//create 3 talks for 2 different days
		testTalk1 = new Talk("Automated testing", testAuthor1, new Date(2026, 06, 01), testLocation1);
		testTalk2 = new Talk("Version control", testAuthor2, new Date(2026, 06, 02), testLocation1);
		testTalk3 = new Talk("Flask", testAuthor1, new Date(2026, 06, 01), testLocation2);
		
		
		
		//create my array of talks for day1 and day2, repectively
		ArrayList<Talk> talksDay1 = new ArrayList<Talk>();
		ArrayList<Talk> talksDay2 = new ArrayList<Talk>();
		talksDay1.add(testTalk1);
		talksDay2.add(testTalk2);
		talksDay1.add(testTalk3);
		
		
		
		//creating the daily programmes for my test conference
		DailyProgramme day1 = new DailyProgramme(talksDay1, testConf, new Date(2026, 06, 01));
		DailyProgramme day2 = new DailyProgramme(talksDay2, testConf, new Date(2026, 06, 02));
				
		
		
		//if I want to add another talk to my day 1:
		testTalk4 = new Talk("Architectural design", testAuthor2, new Date(2026, 06, 01), testLocation2);
		day1.addTalkToProgramme(testTalk4);
		
		
		
		//create a user participant object
		testParticipant = new User("John Smith", true, "UoP", testUserProg);
		DailyProgramme dayAtConf = new DailyProgramme();
		dayAtConf.addTalkToProgramme(testTalk1);
		dayAtConf.addTalkToProgramme(testTalk4);
		testUserProg.add(dayAtConf);
	}
	
	
	
	public static void main(String[] args)
	{
		
		Demo demo = new Demo();
		
		for (DailyProgramme p : demo.testParticipant.getProgs())
		{
		
			ArrayList<Talk> talks = p.getTalks();
			for (Talk t:talks)
			{
				System.out.println(t.getTitle() + "   " + t.getAuthor().getName());
			}
		}
		
		
	}

}
