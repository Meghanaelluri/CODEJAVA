package core_java_programs;

public class Vowels {
	static void seperatevowelsconstant(String s) {
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
				s1 += s.charAt(i);
			else
				s2 += s.charAt(i);
		}
		StringBuilder s3 = new StringBuilder(s1);
		System.out.println(s2 + s3.reverse());
	}
	public static void main(String[]args) {
		
		seperatevowelsconstant("mintu");
		
	}

}