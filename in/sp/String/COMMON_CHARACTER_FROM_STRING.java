package in.sp.String;

import java.util.HashSet;
import java.util.Set;

public class COMMON_CHARACTER_FROM_STRING 
{
	public static void main(String[] args) {
		String str1="inida";
		String str2="suzukia";
		
		
		
		Set<Character> commoanChars=new HashSet<>();
		
		for(char c:str1.toCharArray())
		{
			if(str2.indexOf(c) == 1)
			{
				commoanChars.add(c);
			}
		}
		System.out.println(commoanChars);
	}

}

