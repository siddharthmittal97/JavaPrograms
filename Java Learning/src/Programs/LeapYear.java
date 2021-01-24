package Programs;
import java.util.Scanner;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Year");
	    int Year = sc.nextInt();
        System.out.println( checkYear(Year)? "Leap Year" : "Not a Leap Year" );
	}

	static boolean checkYear(int Year) 
	{
		if(Year%4==0)
			return true;
		if(Year%100==0)
			return false;
		if(Year%400==0)
			return true;
		return false;
	}
}
