package Arrays.newton;

import java.util.Scanner;

public class FindTheThirdLargest 
{
	
	public static void main(String[] args)
	{
		int arr[]= {12,43,12,543,312,12,321};
		int max=arr[0];//assusume this one is largest if not then change 
		int secmax=arr[0];
		int thirdMax=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("maximum largest element :"+max);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>secmax && arr[i]<max)
			{
				secmax=arr[i];
			}
		}
		System.out.println("Second Largest element :"+secmax);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>thirdMax && arr[i]<secmax &&arr[i]<max)
			{
				thirdMax=arr[i];
			}
		}
		System.out.println("Third largest element :"+thirdMax);
	}
}