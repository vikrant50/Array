package in.sp.String;

class P
{

	public  void foo()
	{
		System.out.println("Parent");
	}
	 public void bar()
     {
    	 System.out.println("Parent barrrrr");
     }
	
}
class C extends P
{
	
     public  void foo()
     {
    	 System.out.println("child");
     }
     public void bar()
     {
    	 System.out.println("child barrrrr");
     }
}
public class ADJACENT_REMOVE {

	public static void main(String[] args) 
	{
		P pr=new C();
		C cr=new C();
		
		pr.foo();//Parent
		cr.foo();//child
		
		cr.bar();//chid barr
		pr.bar();//chil barr
	}
}