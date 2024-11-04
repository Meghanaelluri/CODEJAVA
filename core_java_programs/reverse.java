package core_java_programs;

public class reverse {
	public static void main(String[]args) {
		String str = "Hi!Mintu";
		String reversed = "";
		char[] characters =str.toCharArray();
		for(int i  = characters.length-1;i>=0;i--) {
			reversed += characters[i];
		}
		System.out.println("str:"+ str);
		System.out.println("reversed:"+reversed);
		
	}

}
