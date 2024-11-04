package core_java_programs;

public class Examplestring {
	public static void main(String[]args) {
		String str ="hello";
		str=str+"world";
		String str1="hello world";
		System.out.println(str);
		if(str.equals(str1)) {
			System.out.println("block 1");
			
		}
		if(str==str1) {
			System.out.println("block 2");
		}
		if(str.equals(str1)) {
			System.out.println("block 3");
		}
		int len=str.length();// returns length of the specified string.
		System.out.println(len);
		String str2 = "world";
		String str3=str2.concat(str);//appends a string to the end of another string.
		System.out.println(str3);
		char c = str.charAt(1);//returns the character at the specified position.
		System.out.println(c);
		if(str.contains("e")) {//Returns true if and only if this string contains the specified sequence of char values.
			System.out.println("string was there");
			
		}
		String s4=str.substring(1);//returns a string starts with specified characters.
		System.out.println(s4);
		if(str.equalsIgnoreCase("HELLO")) {//Compares two strings, ignoring case considerations.
			System.out.println("inside");
		}
//		System.out.println("Hi Mintu"+str2.codePointAt(c));
//		System.out.println(""+str3.codePointBefore(c));
//		System.out.println(str2.codePointCount(c, len));
//		System.out.println(str.compareTo(str2));
//		System.out.println(str2.compareToIgnoreCase(str2));
//		System.out.println(str.contentEquals(s4));
//		System.out.println(str1.);
		
		
		
		
	}

} 
