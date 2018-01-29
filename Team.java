package src.PA_Assignment_7_4;

import java.util.ArrayList;
import java.util.Random;

public class Team
{
	private String Team;
	String Score;
	ArrayList<Player> team = new ArrayList();
	Player[][] arrayTeam = new Player[2][20];
	
	public Team(String teamName)
	{
		Team = teamName;
		ArrayList<Player> team = new ArrayList();
	}
	public Player getRanPlayer()
	{
		Random gen = new Random();
		int n = gen.nextInt(team.size());
		return team.get(n);
		
	}
	public void teamAdd(Player x)
	{
		team.add(x);
		
	}
	public void teamPrint()
	{
		
		for(Player j : team)
			System.out.println(j);
		
	}
	public String getScore()
	{
		
		return this.Score;
		
	}
	public void setScore(int scoreInc)
	{
		
		Score += scoreInc;
		
	}
	public String getName()
	{
		
		
		return Team;
	}
	
}
						class Player
					{
				Name playerName;
				int myNum;
				boolean Injured;
				
				public Player(Name name, int number)
				{
					 playerName = name;
					myNum = number;
					Random gen = new Random();
							int r = gen.nextInt(101) ;
							if(r  > 90)
								Injured = true;
							if(r  <= 90)
								Injured = false;
					
				}
				public boolean getInjuryState()
				{
					
					
					return Injured;
				}
				

				public String toString()
				{
					
					
					return playerName + " " + myNum; 
					
				}
	
					}

						
						
						class Name
			{
				String firstName;
				String lastName;
				public Name(String first, String last)
				{
					firstName = first;
					lastName = last;
					
				}
				
				public String toString()
				{
					
					return firstName + " " + lastName;
					
				}
				
				
				
			}
