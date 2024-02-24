package in.sp.String;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class REMOVE_DUPLICATE_WORD {

	public static void main(String[] args)
	{
		String str="hello ab hello kya";
		
		//using java 8 
		String[] split = str.split(" ");	
		str=Stream.of(split).distinct().collect(Collectors.joining(" "));
		//System.out.println(str);
		
		//using java 7
		HashSet<String> set=new HashSet<>();
		for(String s:split)
		{
			set.add(s);
		}
		System.out.println(set);

	}

}
