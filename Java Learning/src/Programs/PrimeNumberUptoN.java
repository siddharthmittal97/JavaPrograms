package Programs;
import java.util.Scanner;
public class PrimeNumberUptoN 
{
public static void main(String[] args) 
     {
		int i,n,temp=0,j,range;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range");
		range = sc.nextInt();
		for(i=2;i<=range;i++)
		{
		 for(j=2;j<=i-1;j++)
		 {
			if(i%j==0)
			{
				temp=temp+1;
			}
		 }
		  if(temp==0)
		 {
			System.out.println(i);
		 }
		  else
		 {
			temp=0;
		 }
	    }
      }
}
