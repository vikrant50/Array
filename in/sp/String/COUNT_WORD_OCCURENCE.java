package in.sp.String;

import java.util.HashMap;

public class COUNT_WORD_OCCURENCE
{

	public static void main(String[] args)
	{
		
		
		String str="i am learning java yes i am java am  ";
		
		String[] s=str.split(" ");
		
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String tempString : s)
		{
			if(map.containsKey(tempString))
			{
				map.put(tempString, map.get(tempString)+1);
			}
			else 
			{
			    map.put(tempString, 1);
			}
		} 
		System.out.println(map);

	}	
	// System.out.println(map);
}
