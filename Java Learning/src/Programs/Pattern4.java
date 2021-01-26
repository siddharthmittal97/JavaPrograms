package Programs;
import java.util.Scanner;
public class Pattern4 {
	public static void main(String[] args) {
		int i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=5;j>=i;j--)
			{
			System.out.print("*");
		    }
			System.out.println();
		}
	}

}
