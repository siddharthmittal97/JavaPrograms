package Programs;
import java.util.Scanner;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		int i;
		String rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String a = sc.nextLine();
		int len = a.length();
		for(i=len-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
	}
}
