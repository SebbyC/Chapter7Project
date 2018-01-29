package src.PA_Assignment_7_4;

import java.util.Random;
import java.util.Scanner;

public class SportDriver
{
	public static void main(String[] args)
	{
		Team Jags = new Team("Jags");
		Team Patriots = new Team("Patriots");
		boolean Teamchoice = true;
		for(int i = 0; i < 50; i++)
		{
			
			
			Scanner scan = new Scanner(System.in);
			String firstName = scan.nextLine();
			if(firstName.equals("Jags"))
				Teamchoice = false;
			if(firstName.equals("Pats"))
				Teamchoice = false;
			String lastName = scan.nextLine();
			if(firstName.equals("stop"))
				break;
					
			int num = scan.nextInt();
			Name pName = new Name(firstName, lastName );
			Player newPlayer = new Player(pName, num);
		
			if(Teamchoice)
				Patriots.teamAdd(newPlayer);
			else
				Jags.teamAdd(newPlayer);
			if(newPlayer.getInjuryState())
			{
				System.out.println("Player has been injured");
			}
			
			
		}
		Name blakes = new Name("blake", "bortles" );
		Player Blake = new Player(blakes, 15);
		Football game = new Football(Jags,Patriots);
		boolean play = true;
		while(play)
		{
			Random gen = new Random();
			int n = gen.nextInt();
			if(n < 20 )
			{
						game.Score(Jags, 6);;;
			}
		try
		{
			game.Tackle(Jags.getRanPlayer(), Patriots.getRanPlayer());
		} catch (InjuredException e)
		{
		
			play = false;
			e.printStackTrace();
		}
		
		
		}
	
		
		
		
		
	}

}
