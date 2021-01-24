package Programs;
import java.util.Scanner;
public class PrimeOrNot 
{
  public static void main(String[] args) 
  {
	long i,n,temp=0;
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Range");
	n = sc.nextInt();
	for(i=2;i<=n-1;i++)
	{
		if(n%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("Prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
 }
}
