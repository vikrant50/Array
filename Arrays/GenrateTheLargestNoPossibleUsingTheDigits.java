package Arrays;

import java.util.Arrays;

public class GenrateTheLargestNoPossibleUsingTheDigits {

	public static void main(String[] args)
	{
		// Input :- arr[]={8,6,0,4,6,4,2,7};
		// Output:- Largest No:- 87664420
		
		//1st we will do sort array then it will arrange like that in decending order
		//after that will store this in string value will do concatenate
		
		int arr[]={8,6,0,4,6,4,2,7};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorted :"+Arrays.toString(arr));//[8, 7, 6, 6, 4, 4, 2, 0]
		String result="";
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
		}
		System.out.println(result); //87664420
		
	}

}
