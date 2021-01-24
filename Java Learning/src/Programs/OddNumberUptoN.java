package Programs;
import java.util.Scanner;
public class OddNumberUptoN 
{
	public static void main(String[] args) 
	{
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range");
		n = sc.nextInt();
		for(i=0;i<=n;i++)
		{
		  if(i%2==1)
		  {
			System.out.println(i);
		  }
		}
	}
}
