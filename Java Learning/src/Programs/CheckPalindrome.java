package Programs;
import java.util.Scanner;
public class CheckPalindrome {
	public static void main(String[] args) {
		int rem,rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int orignal=n;
		while(n>0)
		{	
		 rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
	    }
		if(orignal==rev)
		{
			System.out.println("Palindrome");	
		}
		else
		{
			System.out.println("Not Palindrome");	
		}
	}
}
