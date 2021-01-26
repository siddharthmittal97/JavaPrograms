package Programs;
import java.util.Scanner;
public class ArmstrongNo 
{
	public static void main(String[] args) 
	{
		int sum=0,digit;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int orignal=n;
		while(n>0)
		{
			digit=n%10;
			sum += digit*digit*digit;
			n=n/10;
		}
		if(sum==orignal)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
