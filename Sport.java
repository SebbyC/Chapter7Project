package src.PA_Assignment_7_4;

import java.util.ArrayList;

public class Sport
{
	Team One;
	Team Two;
	
	public Sport(Team myOne, Team myTwo)
	{
		Team One = myOne;
				Team Two = myTwo;
		// TODO Auto-generated constructor stub
	}

	public String scoreBoard()
	{
		String Score = One.getName() + " : " + One.getScore() + " \n";
		Score = Two.getName() + " : " + Two.getScore() + " \n";
		return Score;
	}

	
	public void Score(Team elTeam, int score)
	{
		elTeam.setScore(score);
		if(score == 6)
			System.out.println("TOUCHDOWN!!!!!");
		
	}
	
 
	


}


			