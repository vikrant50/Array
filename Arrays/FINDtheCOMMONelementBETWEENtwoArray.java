package Arrays;

import java.util.HashSet;

public class FINDtheCOMMONelementBETWEENtwoArray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr1[]= {1,2,4,5,6};
		int arr2[]= {2,3,5,7};

		
		HashSet<Integer> set=new HashSet();
		
		for(int n:arr1)
		{
			set.add(n);
		}
	    for(int n:arr2)
	    {
	    	if(set.contains(n))
	    	{
	    		System.out.print(n+" ");
	    	}
	    }
		
	}
}