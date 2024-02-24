package Arrays;

import java.util.Arrays;

public class SWAP_LAST_FIRST_AND_FIRST_TO_LAST {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,5,3};
		
		int temp=0;
		
		int first=0;
		int last=arr.length;
		
		while(first<last)
		{
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			
			first++;
			last--;
		}
		System.out.println(Arrays.toString(arr));

	}

}
