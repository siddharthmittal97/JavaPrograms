package Programs;
public class Overriding2 extends Overriding1 
{
	void show()
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		Overriding2 b= new Overriding2();
		b.show();
		Overriding1 c= new Overriding1();
		c.show();
	}
}
