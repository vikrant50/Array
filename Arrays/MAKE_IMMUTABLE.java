package Arrays;

final class Emplo
{
	public String getPanCard() //3rd
	{
		return panCard;
	}

	final String panCard;//2nd stept
	
	public Emplo(String panCard)//4th
	{
		this.panCard=panCard;
	}
}
public class MAKE_IMMUTABLE
{
	public static void main(String[] args)
	{
		
		Emplo e=new Emplo("Fjtpko0964");
		Emplo e2=new Emplo("836485726");
		System.out.println(e2.getPanCard());
		System.out.println(e.getPanCard());

	}

}
