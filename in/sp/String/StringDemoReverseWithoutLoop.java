package in.sp.String;

public class StringDemoReverseWithoutLoop {

	public static void main(String[] args)
	{
//		String str="Java Programming";
//	
//		StringBuilder st=new StringBuilder(str).reverse();
//		
//		String str2=st.toString();
//		System.out.println(" After reverse : "+str2);
//		
//		str2=str2.replaceAll("\\s", "");
//		System.out.println("After removing space : "+ str2);
//		
//	
		String str="india";
	    String rev="";
	   
	   for(int i=str.length()-1;i>=0;i--)
	   {
		   rev=rev+str.charAt(i);
	   }
	     System.out.println(rev);
		
		
	}

}
