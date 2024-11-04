package core_java_programs;

public class Builderbuffer {
	public static void main(String[]args) {
		StringBuilder sb = new StringBuilder("hi");
		System.out.println("StringBuilder:"+sb);
		
		sb.append("Mintu");  //append
		System.out.println("After append:"+sb);
		
		sb.insert(7, ",");   //insert
		System.out.println("After insert:"+sb);
		
		sb.replace(6, 11, "Java");   //replace
		System.out.println("After replace:"+sb);
		
		sb.delete(1, 8);    //delete
		System.out.println("After delete:"+sb);
		
		sb.reverse();     //reverse
		System.out.println("After reverse:"+sb);
		
		sb.length(); //length
		System.out.println("length:"+sb.length());
		
		sb.capacity();  //capacity
		System.out.println("capacity:"+sb.capacity());
		
		sb.ensureCapacity(5);  //ensureCapacity
		System.out.println("ensureCapacity:"+sb.capacity());
		
		sb.setLength(5);  //setLength
		System.out.println("After setLength:"+sb);
		
		sb.charAt(1);   //charAt
		System.out.println("charAt:"+sb);
		
		sb.chars();
		System.out.println("chars:"+sb);
		
		sb.codePointAt(0);
		System.out.println("codepointAt:"+sb);
		
		sb.codePointBefore(1);
		System.out.println("codepointBefore:"+sb);
		
		sb.codePointCount(2, 10);
		System.out.println("codepointCount:"+sb);
		
		sb.codePoints();
		System.out.println("codepoints:"+sb);
		
		sb.compareTo(sb);
		System.out.println("compareTo:"+sb);
		
		sb.deleteCharAt(0);
		System.out.println("deleteCharAt:"+sb);
		
		sb.equals(args);
		System.out.println("equals:"+sb);
		
		sb.getChars(1, 2, null, 3);
		System.out.println("getchars:"+sb);
		
		sb.getClass();
		System.out.println("getClass:"+sb);
		
		sb.hashCode();
		System.out.println("hashCode:"+sb);
		
		sb.indexOf(null);
		System.out.println("indexOf:"+sb);
		
		
		
		
	}

}
