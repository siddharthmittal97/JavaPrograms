package Programs;
import java.util.Scanner;
public class SwapNoUsingThirdVariable 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a is"+" "+ a);//Using the Space for Good Indentation  
		System.out.println("Value of a is"+" "+ b); //Using the Space for Good Indentation
	}
}
