package in.sp.String;

public class SearchStringNameIsPresentOrNot {

	public static void main(String[] args) 
	{
		String arr[]= {"Amit","rahul","rahul","babu"};
		
		String check="Amit";
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==check)
			{
				temp++;
			}
		}
		if(temp==1)
		{
			System.out.println("item present ");
		}
		else
		{
			System.out.println("element not presnet ");
		}
	
		
	}
}
