package Programs;
import java.util.Scanner;
public class MultiplicationTable 
{
 public static void main(String[] args) 
  {
	int n,i;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number for which you want to print table");
	n = sc.nextInt();
	for(i=1;i<=10;i++)
	  {
		System.out.println(n+"*"+i+"="+i*n);	
	  }
  }
}
