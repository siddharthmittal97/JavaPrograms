package Programs;

import java.util.Scanner;

public class GreaterOfThreeNumber {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		n1 = sc.nextInt();
		System.out.println("Enter Second Number");
		n2 = sc.nextInt();
		System.out.println("Enter Third Number");
		n3 = sc.nextInt();
        if(n1>n2 && n1>n3)
        {
        	System.out.println("n1 is greater");
        }
        else if(n2>n1 && n2>n3)
        {
        	System.out.println("n2 is greater");
        }
        else
        {
        	System.out.println("n3 is greater");
        }
	}

}
