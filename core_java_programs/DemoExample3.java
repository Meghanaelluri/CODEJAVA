package core_java_programs;

import java.util.Arrays;

public class DemoExample3 {
	public static void main(String[]args) {
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};// multi dimensional
		
		int a[]= {1,2,3,4,5,6};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
//		int b[][]= {{2,4,6},{1,3,5},{6,8,10}}; //jagged array
		
//		for(int i = 0;i<a.length;i++) {
//			for(int j = 0;j<a.length;j++) {
//				System.out.println(a[i][j]);
//			}
//		}
	}

}
