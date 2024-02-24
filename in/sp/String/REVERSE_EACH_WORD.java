package in.sp.String;

public class REVERSE_EACH_WORD {

	public static void main(String[] args)
	{
		// INPUT:- java code
		//output:- avaj edoc
		
		String input="java code";
		
		String output="";
		
		String[] words=input.split(" ");
		
		for(String word : words)
		{
			String revWord="";
			
			//reverse word
			for(int i = word.length()-1 ; i>=0; i--)
			{
				revWord=revWord +word.charAt(i);
			}
			output= output + revWord +" ";
		}
		System.out.println(output);
		
		

	}

}
