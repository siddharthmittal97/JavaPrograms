package Programs;
import java.util.Scanner;
public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
        System.out.println("Value of a is"+" "+ a);//Using the Space for Good Indentation  
		System.out.println("Value of a is"+" "+ b); //Using the Space for Good Indentation
	}
}
