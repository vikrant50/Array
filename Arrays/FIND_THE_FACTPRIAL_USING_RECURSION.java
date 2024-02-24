package Arrays;

public class FIND_THE_FACTPRIAL_USING_RECURSION {

	public static void main(String[] args)
	{
		int n=5;
		System.out.println(fact(n));
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return n;
		}
		return  n*fact(n-1);
	}
}