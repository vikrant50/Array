package Arrays;

import java.util.Scanner;

public class TakeInputFromUserAndFindMaxElement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];//assuming then will compare
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println(max);

	}

}
