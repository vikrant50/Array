package in.sp.String;

import java.util.LinkedHashSet;
import java.util.Set;

public class REMOVE_DUPLICATE_WORD_ANDREVERSE {

	public static void main(String[] args) 
	{
		String str="hello good morning hat hey good morning amit";
		
		String []stringArray=str.split(" ");
		
		Set<String> setWordUnique=new LinkedHashSet<>();	
		
		for(int i=0;i<stringArray.length;i++)
		{
			setWordUnique.add(stringArray[i]);
		}
		
		System.out.println(setWordUnique.toString());
		
		//now i have to reverse
		String string=setWordUnique.toString();
		string=string.replace("[", "").replace("]","");
		String []split=string.split(",");
		for(int i=split.length-1;i>=0;i--)
		{
			System.out.print(split[i]);
		}
		
		

	}

}
