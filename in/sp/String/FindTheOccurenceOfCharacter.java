package in.sp.String;

import java.util.HashMap;
import java.util.Map;

public class FindTheOccurenceOfCharacter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="india";
		char ch;
		
		Map<Character,Integer> map=new HashMap<>();

		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
		
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);//            
		
		
	}

}
