package in.sp.String;

public class SWAPstringWITHOUTusingVar {

	public static void main(String[] args) 
	{
       
		String str1="Amit";
		String str2="Kumar";
		System.out.println("First string before swap :"+str1);
		System.out.println("Second string before swap :"+str2);
		
		//1st step: str1+str2 = AmitKumar
		str1=str1+str2;//AmitKumar
		
		//2nd step : Store intial string str1 in string str2
		str2=str1.substring(0,(str1.length()- str2.length()));//Amit....here will start from 0 and end will alength-blength ...will capture of a lenof of str2 
		
		//3rd step: store initial string str2 in String str1...this is only beginning index 
		str1=str1.substring(str2.length());//kumar
		
		System.out.println("First string before swap :"+str1);
		System.out.println("Second string before swap :"+str2);
		
		
		

		
		
	}

}
