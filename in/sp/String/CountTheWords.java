package in.sp.String;

import java.util.Scanner;

public class CountTheWords {

	public static void main(String[] args)
	{
		System.out.println("Enter the String :");
		
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();//welcome to java 
		int count=1;
		
		//1st : extract the character from string whereever the character value is space that means the word ends there 
		
		for(int i =0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
					{
				      count++;
					}
		}
		System.out.println("Number of words in a string :"+count);	
	}
}
