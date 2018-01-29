package src.PA_Assignment_7_4;

public class Soccer extends Sport
{

	public Soccer(Team one, Team two)
	{
	
		super(one,two);
		
	}

	public void kick(Player x)
	{
		
		
		System.out.println(x + " Kicks the ball");
		
		
	}
	
	public void SlideTackle(Player x, Player y)
	{
		System.out.println(x + " With a mean slide tackle on " + y);
		
	}
     
}
