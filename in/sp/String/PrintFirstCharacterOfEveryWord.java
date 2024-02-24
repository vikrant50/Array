package in.sp.String;

public class PrintFirstCharacterOfEveryWord {

	public static void main(String[] args)
	{
		String s="Hello User Welocme  ";
		
		char a[]=s.toCharArray();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != ' ')
		      {
				if(i==0)
				{
					System.out.println(a[i]);
				}
				else if(a[i-1]==' ')//here if previous element is space then print that value
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
