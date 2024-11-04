package core_java_programs;
import java.util.*;

public class fibonacci {
	public static void main(String[]args) {
		int n;
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Enter any value of n:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Fibonacci series:");
		System.out.println(a);
		System.out.println(b);
	
		for(int i=1;i<=n;i++)
		{ c= a+b;
          System.out.println(c+" ");
          a=b;
          b=c;
			
		}
		
		
		
	}

}
