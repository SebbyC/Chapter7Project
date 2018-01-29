package src.PA_Assignment_7_4;

public class Baseball extends Sport
{
	public Baseball(Team one, Team two)
	{
		super(one, two);
		
	}
	
	public void StrikeOut(Player x, Player y)
	{
	
		System.out.println(x +"The pitcher for " + super.One.getName() + "Strikes out " + y);
		
	
		
	}
	

}
