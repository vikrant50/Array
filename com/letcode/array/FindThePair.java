package com.letcode.array;

public class FindThePair 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,2,1,1,3,2,2};
		int n=arr.length;
		int count= 0;
		
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			
				if(arr[i]==arr[j])
				{
					
					System.out.println(arr[i]+" "+arr[j]);
					count++;	
				}
	
		}
		System.out.println(count);
	}

}
