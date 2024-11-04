package core_java_programs;

import java.util.Arrays;

public class ArrayDeletionExample {
	public static void main(String[]args) {
		int[] originalArray = {1,2,3,4,5,6};
		
		int indexValue=4;
		
		int[] newArray = new int[originalArray.length-1]; 
		
		for(int i=0;i<indexValue;i++) {
			newArray[i]=originalArray[i];
		}
		
		for(int i = indexValue;i<newArray.length;i++) {
			
			newArray[i]=originalArray[i+1];
			
		}
		
		System.out.println(Arrays.toString(newArray));
		
	}
	


}


