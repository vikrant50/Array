  package com.letcode;

public class LastStringFind {

	public static void main(String[] args)
	{
		//find the last sentenece character count 
		//input:	String str="i love java jhdfkjhskjfh"; 
		//output : 12
		
	String str="i love java jhdfkjhskjfh";
	String str1=str.trim();//here 1st we romeved spaced both side 
	int count=0;
	for(int i=str1.length()-1;i>0;i--)//here we reversed  word 
	{
		
		if(str1.charAt(i)==' ')//if space then break
		{
			break;
		}
		count++;//count the character
	}
	System.out.println(count);
		
	

	}

}
