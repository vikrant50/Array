package in.sp.String;
/*
 input :- ab, cd, xys
 out :-7
 */

public class CountTheTotalNoOfCharacterSpaceAndCommasShouldNotCount {

	public static void main(String[] args) 
	{
		String str="ab,cd, xys ";
		
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' '&& str.charAt(i)==',' )
			{
				count++;
			}
		}
		System.out.println(count);
	

	}

}
