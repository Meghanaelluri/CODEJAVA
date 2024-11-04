package core_java_programs;

public class Builder {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println(sb);
		
		
		StringBuffer sbf = new StringBuffer("hi");
		sbf.append("Mintu");
		System.out.println(sbf);
		System.out.println("reverse of the given string is "+sb.reverse());
		System.out.println("inserting in the string"+sb.insert(1,"session"));
		System.out.println("deletion operation: "+ sb.delete(1, 5));
	}

}
