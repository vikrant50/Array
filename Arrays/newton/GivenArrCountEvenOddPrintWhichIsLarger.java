package Arrays.newton;

import java.util.Scanner;

public class GivenArrCountEvenOddPrintWhichIsLarger {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		 Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];

	        for(int i=0;i<n;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        int evenCount=0;
	        for(int i=0;i<n;i++)
	        {
	            if(arr[i]%2==0)
	            {
	                evenCount++;
	            }
	        }
	        int oddCount=n-evenCount;

	        if(evenCount>oddCount)
	        {
	            System.out.println("Even count is largest :"+evenCount);
	        }
	        else
	        {
	            System.out.println("odd count is largest :"+oddCount);
	        }
	    }
	}