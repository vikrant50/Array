package Arrays;

public class LinearSearchElementInArray 
{
	public static void main(String[] args)
	{
		// Linear search : it will compare each and every element from array 
		int a[]= {104,10,40,50,30};
		
		int search_element=10;
		boolean flag=false;
		
		for(int i=0; i<a.length;i++)
		{
	      	if(search_element==a[i])
	    	{
               System.out.println("Element found at : "+i);
                flag=true;
                break;
		    }
       	}
		if(flag==false) 
		{
		System.out.println("element not found ");
		}
	}
}
