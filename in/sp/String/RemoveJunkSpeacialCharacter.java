package in.sp.String;

public class RemoveJunkSpeacialCharacter {

	public static void main(String[] args) {
		
//		String s="a/^@*#%&^@%$#%$$@%&( latin string 01234567890";
//		
//		s=s.replaceAll("[^a-zA-Z0-9]", "");	
//		System.out.println(s);
//		
//		//if i want to remove special chracter
//		String s1="@#$#$@ testing #@$#@$ Selnium java !@#$% &&& JavaAmit";
//		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
//		
//		System.out.println(s1);
	
		String str=" @!#$$@ amit kumar raj @#!am@mi@ ";
	
		str=str.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(str);		
	}

}
