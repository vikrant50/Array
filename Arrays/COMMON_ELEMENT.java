package Arrays;

import java.util.HashSet;
import java.util.Set;

public class COMMON_ELEMENT {

	public static void main(String[] args)
	{
		//ques1: find the common element 
		//ques2: find the union element
		int arr1[]= {1,2,3,4,5,10};
		int arr2[]= {6,7,4,3,10,5};
		
		//printIntersection(arr1, arr2);
		printUnionElement(arr1, arr2);
		

	}
	static void printUnionElement(int arr1[],int arr2[])
	{
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}
		System.out.println("unique element :"+set);
	}
	static void printIntersection(int arr1[],int arr2[])
	{
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(set.contains(arr2[i]))
			{
				System.out.println(arr2[i]+" ");
			}
		}
	}

}
