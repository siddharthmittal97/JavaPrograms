package Programs;
public class InitialisationViaMethod {
	int age;
	String color;
	void method1(int a,String b)
	{
		age=a;
		color=b;
	}
	void display()
	{
		System.out.println(age+" "+color);
	}
	public static void main(String[] args) 
	{
		InitialisationViaMethod a=new InitialisationViaMethod();
		a.method1(20,"XYZ");
		a.display();
	}
}
