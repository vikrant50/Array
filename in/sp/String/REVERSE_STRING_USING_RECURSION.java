package in.sp.String;


public class REVERSE_STRING_USING_RECURSION 
{

	public static void main(String[] args) 
	{
		String str="india";
		System.out.println(reverseStringUsingRecursion(str));
	}
	
	public static String reverseStringUsingRecursion(String s)
	{
		
		if(s == null || s.length()<=1)
		{
			return s;
		}
		return reverseStringUsingRecursion(s.substring(1))+s.charAt(0);
		
	
	}
}