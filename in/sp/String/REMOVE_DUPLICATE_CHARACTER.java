package in.sp.String;

import java.util.HashSet;

/*
 1. USING JAVA 8
 2. Using Character Array
 3. Using Set interface method 
 */
public class REMOVE_DUPLICATE_CHARACTER {

	public static void main(String[] args) 
	{
	    String str="programming";
	    
	    //Approach-1
//	    StringBuilder sb1=new StringBuilder();
//	    str.chars().distinct().forEach(c->sb1.append((char)c));
//	    System.out.println(sb1);
	    
	   
	    //Approach-2
	    char[] arr=str.toCharArray();
	    StringBuilder sb3=new StringBuilder();
	    for(int i=0;i<arr.length;i++)
	    {
	    	boolean repeated=false;
	    	for(int j=i+1 ; j<arr.length ; j++)
	    	{
	    		if(arr[i]==arr[j])
	    		{
	    			repeated=true;
	    			break;
	    		}	
	    	}
	    	if(repeated==false)
	    	{
	    		sb3.append(arr[i]);
	    	}
	    }
	    System.out.println(sb3);
	    
	    //Approach 3
	    StringBuilder sb4=new StringBuilder();//to append the character 
	    HashSet<Character> set=new HashSet<>();
	    for(int i=0; i<str.length(); i++)
	    {
	    	set.add(str.charAt(i));
	    }
	    for(Character c: set)
	    {
	    	
	    	sb4.append(c);
	    }
	    System.out.println(sb4);
	    
	   
	}

}
