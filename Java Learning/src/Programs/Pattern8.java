package Programs;
import java.util.Scanner;
public class Pattern8 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=2;j<=i;j++)
			{
			System.out.print(" ");
		    }
			for(k=5;k>=i;k--)
			{
			System.out.print("*");
			}
			System.out.println("");
			}
        }
}
