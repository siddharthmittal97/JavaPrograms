package Programs;
import java.util.Scanner;
public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		long i,rem,n,rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		while(n>0)
		{	
		 rem=n%10;//3
		 rev=rev*10+rem;//3
		 n=n/10;//12
	    }
		System.out.println(rev);
	}
}
