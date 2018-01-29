package src.PA_Assignment_7_4;

import java.util.ArrayList;

public class Football extends Sport
{
	Team One;
	Team Two;
	
	public Football(Team myOne, Team myTwo)
	{
		super(myOne,myTwo);
				Team One = myOne;
				Team Two = myTwo;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String scoreBoard()
	{
		String Score = One.getName() + " : " + One.getScore() + " \n";
		Score = Two.getName() + " : " + Two.getScore() + " \n";
		return Score;
	}

	@Override
	public void Score(Team elTeam, int score)
	{
		
		elTeam.setScore(score);
		if(score == 6)
			System.out.println("TOUCHDOWN!!!!!");
		
	}
	public void Tackle(Player x, Player y) throws InjuredException
	{
	if(x.Injured == true || y.Injured == true)
	{
		throw new InjuredException(x);
		
		
	}
		
		System.out.println(x + "With a hard tackle on " + y);
	
	}

}
