package in.sp.String;

public class GIVEN_STRING_HALF_LOWERCASE_AND_HALF_UPERCASE {

	public static void main(String[] args)
	{
		String str="This is CloudTech This is CloudTech";
		
		int mid=str.length()/2;//here we got mid 
		
		String lowerCase="";
		String upperCase="";
		
		for(int i=0; i<str.length();i++)
		{
			if(i<mid)
			{
				lowerCase=lowerCase+ Character.toLowerCase(str.charAt(i));
			}
			else
			{
				upperCase=upperCase+Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(lowerCase + upperCase);
		
		

	}

}
