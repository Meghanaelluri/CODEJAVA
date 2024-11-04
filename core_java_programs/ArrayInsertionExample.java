package core_java_programs;

import java.util.Arrays;

public class ArrayInsertionExample {
	public static void main(String[]args) {
		int[] originalArray = {1,3,4,5,6};
		
		int insertingElement = 2;
		
		int indexValue=1;
		
		int[] newArray = new int[originalArray.length+1]; 
		
		for(int i=0;i<indexValue;i++) {
			newArray[i]=originalArray[i];
		}
		
		newArray[indexValue]=insertingElement;
		
		for(int i = indexValue;i<originalArray.length;i++) {
			
			newArray[i+1]=originalArray[i];
			
		}
		
		System.out.println(Arrays.toString(newArray));
		
	}
	



}

