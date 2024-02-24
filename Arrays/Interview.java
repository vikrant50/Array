package Arrays;

import java.util.ArrayList;
import java.util.List;

class Student
{

	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class Interview {

	public static void main(String[] args)
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Amit", 23));
		list.add(new Student("Rahul", 43));
		list.add(new Student("Vinod", 24));
		list.add(new Student("sandhya", 25));
		
		for(Student s:list)
		{
			if("Amit".equals(s.name))
			{
				System.out.println(s.getName());
			}
		}
	}

}
