package Arrays;

import java.util.HashSet;

//i/p:- int arr[]={3,9,5,9,10}
//o/p:-9

public class FirstRepeatingElement {

	public static void main(String[] args) 
	{
		
		//StringBuilder  s=new StringBuilder();
		int arr[]= {3,4,5,9,10,43,43,43};
		int min = -1;
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				min = i;
				break;
			}
			else 
			{
				set.add(arr[i]); 
			}
		}
		if(min != -1)
		{
			System.out.println("Repating element is "+arr[min]);
		}
		else {
			System.out.println("No repeating element ");
		}
		
	

	}

}
