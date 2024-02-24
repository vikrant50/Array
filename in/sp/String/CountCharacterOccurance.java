package in.sp.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/*
 1 . How to reverse String 
 2 . Remove duplicate Character
 3 . Reverse Each Word in String 
 4 . Find Char Occurance
 5 . Find Non Repeated Char
 6 . Replace char with occurance 
 7 . Find Longest substring 
 8 . Sort String Characters
 9 . Remove Whitespace in String 
 */
public class CountCharacterOccurance 
{

	public static void main(String[] args) 
	{
		
		 String str= "india";
	   	 char ch;
		 Map<Character,Integer> map=new HashMap();
		 
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
		 System.out.println(map);
	}
}