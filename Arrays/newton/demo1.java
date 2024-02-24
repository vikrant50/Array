package Arrays.newton;

class CheckId extends Exception
{
	public CheckId(String s)
	{
		super(s);
	}
}

public class demo1 
{

	static void detect(int []array,int id) throws CheckId
	{
		boolean stdFlag=false;
		for(int j:array)
		{
			if(id==j)
			{
				stdFlag=true;
				break;
			}
		}
				if(!stdFlag)
				{
					throw new CheckId("invalid Data");
				}
				else
				{
					System.out.println("valid data ");
				}

	}
	
	public static void main(String[] args)
	{
		try 
		{
			detect(new int [] {1001,1002,1003,1004,1005,1006,},1008);
		}
		catch(CheckId e)
		{
			System.out.println(e.getMessage());
		}
	}
}