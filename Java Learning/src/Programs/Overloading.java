package Programs;
public class Overloading
{
	void show(int a)
	{
		System.out.println("b");
	}
	void show(int a, int b)
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		Overloading a = new Overloading();
        a.show(10,20);
	}
}
