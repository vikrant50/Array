package com.letcode;

public class PairSum {

	public static void main(String[] args) 

	{
		int arr[]= {120,2,30,4,5,6,50,50,50};
		int target=150;
		
		for(int i =0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j) ;
				}
			}
		}
	}

}
