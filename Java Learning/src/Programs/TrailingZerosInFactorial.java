package Programs;
import java.util.Scanner;
public class TrailingZerosInFactorial {
	public static void main(String[] args) {
		int n,i,count;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n = sc.nextInt();
		count=0;
		for(i=5;n/i>=1;i=i*5)
		{		
			count=count+n/i;
		}
		System.out.println(count);
	}
}
