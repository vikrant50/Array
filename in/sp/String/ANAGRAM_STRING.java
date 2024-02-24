package in.sp.String;
/*
 1 st conver String to Char array
 2nd Sort the array 
 Compare both sort arrays
 */
import java.util.Arrays;

public class ANAGRAM_STRING {

	public static void main(String[] args) {
		String str="abc";
		String str2="caba";
		
		char ch[]=str.toCharArray();
		
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] != ch2[i])
			{
			   System.out.println("Not anagram");
			   break;
			}
			else
			{
				System.out.println("Angram");
				break;
			}
		
		}
		
	
		
		

	}

}
