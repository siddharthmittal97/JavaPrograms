package Programs;
import java.util.Scanner;
public class PrintFibonacciSeries 
{
	public static void main(String[] args) 
	{
		long a,b,c,n,i; 
		a=0;
		b=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for(i=1;i<n;i++)
		{
		 System.out.println(a);
		 c=a+b; 
		 a=b;
		 b=c;
		}	
	}
}