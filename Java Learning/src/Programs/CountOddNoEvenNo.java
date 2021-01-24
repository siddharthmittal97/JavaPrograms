package Programs;
import java.util.Scanner;
public class CountOddNoEvenNo {
	public static void main(String[] args) {
		int i,count,count1,n;
		count=0;
		count1=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		for(i=0;i<=n;i++)
		{
			if(i%2==1)
			{
				count++;
				
			}
			else
			{
				count1++;
			}
		}
		System.out.println("Count of Even Number is"+" "+count);
		System.out.println("Count of odd Number is"+" "+count1);
	}
}
