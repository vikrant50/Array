package in.sp.String;

import java.util.HashSet;

public class FindDublicateByUsingHashSet {

	public static void main(String[] args)
	{
		String arr[]= {"java","python","java","c"};
		
		HashSet<String> set=new HashSet();//store only unique element 
		boolean flag=false;
		/*
		 
		System.out.println(	lang.add("Java"));
		System.out.println(	lang.add("ava"));
		System.out.println(	lang.add("va"));
		System.out.println(	lang.add("Java"));//false
	    
	    
	    */
		
		for(String l:arr)
		{
			if(set.add(l)==false)
			{
				System.out.println(" found duplicate element "+l);
				flag=true;
			}
			
		}		
		if(flag==false)
		{
			System.out.println(" duplicate not found ");
		}
		
	}

}
