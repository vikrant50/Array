package Arrays.newton;

public class findTheSingleElement {

	public static void main(String[] args) 
	{
		//input:- {2,2,1};
		//output:- 1
		int arr[]= {2,2,1,1,13,12,31};
		//int count=0;
		
		//logic : comparing every element by itself  if only 1 count then we get single element if(count==1-->single 
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])//
				{
					count++;
				}
				
			}
			//if you want ti find single element which has no pair then count==1
			if(count==1)
			{
				System.out.println(arr[i]);
			}
			
			
		}
		
		
	}
	

}
