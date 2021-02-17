package Programs;
public class Constructor1 
{
	int age;
	String name;
	Constructor1(String name,int age)
	{
		this.name=name;
		this.age=age;		
	}
	public static void main(String[] args) 
	{
		Constructor1 a= new Constructor1("Siddharth",90);
		Constructor1 b= new Constructor1("Siddharth2",91);
		System.out.println(a.name+""+a.age);
		System.out.println(b.name+""+b.age);
	}
}
