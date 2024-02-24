package Arrays;

import java.util.Arrays;

public class RIGHT_SHIFT_BY_ONE_ELEMENT {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		int arr[]= {12,32,55,32,233};
		//output:- 233/12/32/55/32
		
		int lastIndex = arr[arr.length-1];//last index outside here

		for(int i=arr.length-1;i>0;i--)//
		{
			arr[i]=arr[i-1];//till after 4 element shifted 
		}
		arr[0]=lastIndex;//here 1st index we set 1st position
		System.out.println(Arrays.toString(arr));
		
		
	}
}