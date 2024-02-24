package Arrays;

public class EvenOddArraySum
{

	public static void main(String[] args) 
	{	
	    int  arr[] = {2,4,5,65,4,3,32};
	    int evenSum=0;
	    
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				evenSum=evenSum+arr[i];
			}
		}
		System.out.println(evenSum);
	}
}