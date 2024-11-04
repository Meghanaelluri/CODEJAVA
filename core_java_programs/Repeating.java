package core_java_programs;

public class Repeating {
	public static void main(String[]args) {
		String str ="mintu";
		int[] arr = new int[256];
		for(char ch:str.toCharArray()) {
			
			arr[ch]++;
			
		}
		int nonrepeating =0;
		for(char ch:str.toCharArray()) {
			if(arr[ch]==1) {
				 nonrepeating++;
				 
				
			}
			
		}
		
		System.out.println(nonrepeating);
	}

}
