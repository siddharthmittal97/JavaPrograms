package Programs;
import java.util.Scanner;
public class CountEvenNo 
{
	public static void main(String[] args) 
	{
		int i,count,n;
		count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
