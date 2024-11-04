package core_java_programs;

public class Palindrome {
	public static void main(String[]args) {
		String str = "Hi!Mintu";
		String reversed = "";
		char[] characters =str.toCharArray();
		for(int i  = characters.length-1;i>=0;i--) {
			reversed += characters[i];
		}
		if(str==reversed) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
	}
	
		

}


