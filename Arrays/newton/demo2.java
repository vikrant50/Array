package Arrays.newton;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
       // Taking input from user and print 
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		//adding value in array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//printing value in array 
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(" "+arr[i]);
		}
	

	}

}
