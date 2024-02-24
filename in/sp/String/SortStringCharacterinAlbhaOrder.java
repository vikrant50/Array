package in.sp.String;

import java.util.Arrays;

/*
 2 ways:- 1st using for loop   2nd: Arrays.sort(ch\
 )
 */
public class SortStringCharacterinAlbhaOrder {

	public static void main(String[] args)
	{
		String str="romjxhgdfvjhgxvjck";
	
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
			
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}
}
