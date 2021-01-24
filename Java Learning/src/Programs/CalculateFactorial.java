package Programs;
import java.util.Scanner;
public class CalculateFactorial {
	public static void main(String[] args) {
		int n,f=1,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println(f);
	}

}
