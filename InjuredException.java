package src.PA_Assignment_7_4;

public class InjuredException extends Exception
{
	Player InjuredPlayer;
	public InjuredException(Player x)
	{
		super();
		
		InjuredPlayer = x;
		System.out.println(x + "is injured and cannot play");
	}

}
