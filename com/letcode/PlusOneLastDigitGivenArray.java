package com.letcode;

public class PlusOneLastDigitGivenArray 
{

	public static void main(String[] args)
	{
		//input:- arr[]= {1,2,3};
		//output:- {1,2,4,23}
		
		int arr[]= {1,9};
		
		int last=arr[arr.length-1]; //             
		
		arr[arr.length-1]=last+1;
	
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
