package core_java_programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[]args) {
	int m,e,length=0,sum=0;
	Scanner sc = new Scanner(System.in);
	System. out.println("Enter any number:");
	m = sc.nextInt();
	e = m;
	while(m>0) {
		m/=10;
		length++;
	}
		m=e;
	while(m>0) {
		int rem=m%10;
		sum+=Math.pow(rem, length);
		m=m/10;
	}
	if(sum==e) {
		System.out.println("It is an a armstrong number:");
	}
	else {
		System.out.println("It is not a armstrong number:");
	}
	}
	
	

}
