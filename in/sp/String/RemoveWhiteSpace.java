package in.sp.String;

public class RemoveWhiteSpace {

	public static void main(String[] args)
	{
		String str="Java Programmming   amit automtion   ";
		System.out.println("Before removing the white spaces:"+str);
		
		str=str.replaceAll("\\s", "");
	    System.out.println("After removing the white spaces : "+str);
	   
	 
	}
}



