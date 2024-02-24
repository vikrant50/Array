package Arrays;
/*
 write a program to separate out positive and negative no- from array and print the count of total positive no and negative no
 input:- [9,10,-10,20,-27,30,-36,40,45,50]
 output:- total positive no :- 7
                             [9,10,20,30,40,45,50]
         total negative no :- 3
                             [-18,-27,-36]
 */

public class SEPARATEpositiveNegativeNo 
{

	public static void main(String[] args) 
	{
		int arr[]= {9,10,-10,20,-27,30,-36,40,45,50};
		
		int positiveNumbersArray[]=new int[10];
		int negativeNumbersArray[]=new int[10];
		
		int positiveCount=0;
		int negativeCount=0;
		
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negativeNumbersArray[negativeCount]=arr[i];
				negativeCount++;
			}
			else
			{
				positiveNumbersArray[positiveCount]=arr[i];
				positiveCount++;	
			}
				
		}
		System.out.println("total positive number is: "+positiveCount);
		System.out.println("total negative number is: "+negativeCount);
		
		System.out.println("positive array elements: ");
		printArrayElements(positiveNumbersArray, positiveCount);
		
		System.out.println("\n Negative array elements: ");
		printArrayElements(negativeNumbersArray, negativeCount);
	
	}
	public static void printArrayElements(int arr[],int size)
	{
		for(int i=0 ; i < size ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
