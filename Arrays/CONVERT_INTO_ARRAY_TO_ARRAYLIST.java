package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CONVERT_INTO_ARRAY_TO_ARRAYLIST 
{
	public static void main(String[] args) {
		
		String [] colors = {"Red","Green","Blue"};
		
		//1st ways
       //List<String> asList = Arrays.asList(colors);
       //System.out.println(asList);
		
		//2nd ways
		
		List<String> l=new ArrayList<>();
		Collections.addAll(l, colors);
		System.out.println(l);
		
	
	}

	
}
