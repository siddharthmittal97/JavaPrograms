package Programs;
public class InitialisationViaReferenceVariable 
{
	String name;
	int age;
	public static void main(String[] args) 
	{
		InitialisationViaReferenceVariable a = new InitialisationViaReferenceVariable();
		a.age=12;
		a.name="Siddharth";
		System.out.println(a.name+""+a.age);
		}
}
