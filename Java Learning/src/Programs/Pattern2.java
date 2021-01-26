package Programs;
import java.util.Scanner;
public class Pattern2 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
			System.out.print("*");
		    }
			System.out.println();
		}
	}
}
