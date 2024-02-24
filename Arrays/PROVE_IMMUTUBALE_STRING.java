package Arrays;

public class PROVE_IMMUTUBALE_STRING
{
	public static void main(String[] args) {
		String s1="java";
		String s2=s1;
	
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		s1="python";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2);
	}

}
