package Programs;
import java.util.Scanner;
public class Pattern12 
{
	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=n;l>i;l--)
			{
				System.out.print("*");
			}
			 System.out.println("");
		}
	}
}
