package in.sp.String;

public class VowelConstonantCharacterCount {

	public static void main(String[] args)
	{
		 


		String str="aakjhh";
		
		str=str.toLowerCase();
		
		//char ch[]=str.toCharArray();
		int vowel = 0;
		int cons = 0;
		
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u')
			{
				vowel=vowel+1;
			}
			else
			{
				cons=cons+1;
			}
		}
		System.out.println("total vowel : " +vowel);
		System.out.println("total consonanat:"+cons);
	    
		
		
	}

}
