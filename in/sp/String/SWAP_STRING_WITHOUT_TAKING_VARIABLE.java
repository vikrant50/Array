package in.sp.String;

public class SWAP_STRING_WITHOUT_TAKING_VARIABLE {

	public static void main(String[] args) 
	{
		//    
		String a="world";
		String b="hello";
		
		a=a+b;//worldhello
		b=a.substring(0,a.length()-b.length());//world
		a=a.substring(b.length());//hello
		System.out.println(a);
		System.out.println(b);
	}
}
