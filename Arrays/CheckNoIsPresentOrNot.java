package Arrays;

public class CheckNoIsPresentOrNot {

	public static void main(String[] args) 
	{
		int arr[]= {12,5,43,2,212,2,123,123};
	   
		
		int checkNo = 12;
		int flag=0;
		
	
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==checkNo)
			{
				flag++;
			}
			
		}
		if(flag==2)
		{
			System.out.println("element present ");
		}
		else
		{
			System.out.println("element not present ");
		}
	}
}