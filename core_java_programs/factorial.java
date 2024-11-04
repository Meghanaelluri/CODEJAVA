package core_java_programs;

import java.util.Scanner;

public class factorial {
	public static void main(String[]args) {
		int number =10;
		int fact = 1;
		int i =1;
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		for(i=1;i<=number1;i++) {
			fact*=i;
		}
		System.out.println("factorial of given number"+number1+"="+fact);
	}

}
