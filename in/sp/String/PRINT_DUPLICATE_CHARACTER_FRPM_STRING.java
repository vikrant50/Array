package in.sp.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PRINT_DUPLICATE_CHARACTER_FRPM_STRING {

	public static void main(String[] args)
	{
		String str="javainterviewfsssss";
		char ch;
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			 ch=str.charAt(i);
			 if(charMap.containsKey(ch))
			 {
				 charMap.put(ch, charMap.get(ch)+1);
			 }
			 else
				 charMap.put(ch, 1);
			
		}
		Set<Entry<Character,Integer>> mapSet=charMap.entrySet();
		
		for(Entry<Character,Integer> entry: mapSet)
		{
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+"  : "+entry.getValue());
			}
		}

	}

}
