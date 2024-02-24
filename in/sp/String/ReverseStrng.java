package in.sp.String;

public class ReverseStrng {

	public static void main(String[] args) 
	{
	     //1ST WAY :- USING charAt(int index)
		//2nd way : using toCharArray() method
		//3rd ways :Using StringBuilder
		
		//using charAt(i)->to check element index position
		//will find length and take one for loop and increment of index position
		
		String str="amit";
		
//		THIS IS 1ST WAYS
//		String rev="";
//		String oz=str;
		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		//System.out.println(rev);
//		

        char[]ch= str.toCharArray();
        
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		
		
	}

}
