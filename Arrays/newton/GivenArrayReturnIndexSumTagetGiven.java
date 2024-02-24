package Arrays.newton;

public class GivenArrayReturnIndexSumTagetGiven {

	public static void main(String[] args) 
	{
		//input :- arr[]={2,7,11,15};  7 ==9-2 ||j=target-i
		//targetsum=9
		//output:- [0,1,4,5] 
		int arr[]= {2,7,11,15,2,6};	
		int target=13;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==target-arr[i])
				{
					System.out.print(i+ "  " +j );
					
				}
				//System.out.print(arr[j]);
				
			}
		}

	}

}
