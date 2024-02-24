package Arrays;

public class FIND_POWER_BT_TWO_INTEGER {

	public static void main(String[] args)
	{
		int b=3;
		int p=1 ;
		
		int power=pow(b,p);
		System.out.println("b : "+b+" , p: "+p);
		System.out.println(power);

	}
	public static int pow(int b,int p)
	{
		int power=1;	
		for(int i=1;i<=p;i++)
		{
			power=power*b;
		}
		return power;
	
		
	
	}

}
