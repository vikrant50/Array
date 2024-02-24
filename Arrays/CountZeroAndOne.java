package Arrays;

public class CountZeroAndOne {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,1,2,0,1};
		
		int countOne=0;
		
		int countZero=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
			{
				countOne++;
			}
			else if(arr[i]==0)
			{
				countZero++;
			}
		}
		System.out.println(countOne);
		System.out.println(countZero);	
	}

}
