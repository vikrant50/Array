package in.sp.String;

public class ReplaceCharacter {

	public static void main(String[] args) 
	{
	String str="Hello World !! welcome to cOding simplified";
	
	char ch[]=str.toCharArray();

	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='o' || ch[i]=='O')
		{
			ch[i]='y';
		}
	}
	System.out.println(ch);
	}
	
	

}
