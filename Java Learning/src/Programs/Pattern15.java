package Programs;
import java.util.Scanner;
class Pattern15 
 {
	public static void main(String[] args) 
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n = sc.nextInt();
	 int i,j,k;
     for(i=1;i<=n;i++)
       {
    	for(j=n;j>i;j--)
    	{
    		System.out.print(" ");
    	}
    	System.out.println("*");
       }
	}
}
