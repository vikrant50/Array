package Arrays;

public class REMOVE_WHITESPACE_WITHOUT_USING_INBUILD_METHOD {

	public static void main(String[] args) 
	{
		String str="jdfkj jsv sibsdskcjb";
		//char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				System.out.print(str.charAt(i));
			}
		}

	}

}
