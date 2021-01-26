package Programs;
import java.util.Scanner;
public class Pattern9 
{
	public static void main(String[] args) 
   {
	int i,j,k;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
    int n = sc.nextInt();
    
    //First Loop Starts
    for(i=1;i<=n;i++) 
   {
	for(j=n-1;j>=i;j--)
	   {
		System.out.print(" ");
	   }
	for(k=1;k<=i;k++)//k=2 
	   {
		System.out.print("*");
	   }
	    System.out.println("");
   }
    //First Loop Ends
    
    
  //Second Loop Starts
    for(i=1;i<=n;i++)
   {
	 for(j=1;j<=i;j++)
	   {
		System.out.print(" ");
	   }
	 for(k=n-1;k>=i;k--)
	   {
		System.out.print("*");
	   }
	  System.out.println("");
   }
    //Second Loop Starts
    
 }
}
