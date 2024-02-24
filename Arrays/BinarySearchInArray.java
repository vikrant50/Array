package Arrays;

public class BinarySearchInArray {

	public static void main(String[] args) 
	{
		// basically we need to find out the mid value
		//MID=(LOWER+HIGHER)/2
		//MID=(0+9)/2=4
		//o(logn)
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
		boolean flag = false;
		
		int search=5;
		
		int start=0;
		int last=a.length-1;
		int mid=0;
		
		while(start<=last)
		{
			 mid=(start+last)/2;//m--> index represent 
			
			if(a[mid]==search)
			{
				System.out.println("Element found "+a[mid]);
				flag=true;
				break;
			}
		
			else if(a[mid]<search)
		    {
			  start=mid+1;
		    }
			else
		   {
			  last=mid-1;
		   }
		}
	
	if(flag==false)
	{
		System.out.println("Element not found");
	}

}
}
