 package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.OptionalInt;
import java.util.Set;

public class DUBLICATE_ELEMENT_FIND {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int arr[]= {1,2,2,34,2};
        
        
        //efficient ways 
        HashSet<Integer> unique=new HashSet<Integer>();        
        HashSet<Integer> duplicate=new HashSet<Integer>();        
	
        for(int n:arr)
        {
        	if(!unique.add(n))
        	{
        		duplicate.add(n);
        		//System.out.println(n);
        	}
        }
        System.out.println(duplicate);
        
        System.out.println("=============================================");   
        
        int ar[]= {1,2,3,4,5,2};
   	    HashSet<Integer> unq=new HashSet<>();   	 
   	    Arrays.stream(ar).filter(n->!unq.add(n)).forEach(System.out::println);
   	 
        
        
        
     System.out.println("=============================================");
        
        
      String str[]= {"amit","rahul","amit"};
  	  
  	  HashSet<String> unique2=new HashSet<>();
  	  
  	  HashSet<String> duplicate2=new HashSet<>();
  	  for(String n:str)
  	  {
  		if(!unique2.add(n))
  			 duplicate2.add(n);
  		 
  		  
  	  }
  	  System.out.println(duplicate2);
  	 
	
	}
}
     