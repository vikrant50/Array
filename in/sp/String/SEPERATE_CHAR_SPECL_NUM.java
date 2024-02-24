package in.sp.String;

public class SEPERATE_CHAR_SPECL_NUM {

	public static void main(String[] args)
	{
		String str="abcjshddfAS1212JASDFJMDDKF123@6#!23xyz";
		
		String alpha="";
		String num="";
		String splchar="";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				num=num+str.charAt(i);
			}
			else if(Character.isAlphabetic(str.charAt(i)))
			{
				alpha=alpha+str.charAt(i);
			}
			else
				splchar=splchar+str.charAt(i);
		}
		System.out.println(num);
		System.out.println(alpha);
		System.out.println(splchar);

	}

}
