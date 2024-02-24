package in.sp.String;

public class FindDuplicate 
{

	public static void main(String[] args) 
	{

//		String arr[]= {"java","Python","java","math"};
//		
//		boolean status=false;
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("found duplicate element : " +arr[i]);
//					status=true;
//
//				}
//				
//			}
//		}
//		if(status==false)
//		{
//			System.out.println("Duplicate not found");
//		}
		
		
		int arr[]= {1,23,4,5,6,7,8};
		
		int temp=0;
		//
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1 ; j<arr.length-1 ; i++)
			{
				if(arr[i]==arr[j])
				{
					temp++;
				}
			}
		}
		//if(temp==1)
			
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	