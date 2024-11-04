package core_java_programs;

public class DemoExample {
	public static void main(String[]args) {
		
		int [] a = {1,2,3,4,5};
		
		String []s= {"hi","hello"};
		
		int a1[] = {6,7,8};
		
		int [] x = new int[5];
		x[0]=1;
		x[0]=2;
		x[0]=3;
		x[0]=4;
		x[0]=5;
		
		for(int i=0;i<a.length;i++) {
			x[i]=i+1;
			System.out.println(x[i]);
		}
		for(int j=0;j<x.length;j++) {
		System.out.println(x[j]); 
		}
		
	}
}
