package Programs;
import java.util.Scanner;
public class Pattern1 
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("*");//Printing in next line
		}
	}
}
