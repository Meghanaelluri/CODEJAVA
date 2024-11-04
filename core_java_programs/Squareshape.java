package core_java_programs;

public class Squareshape {
	public static void main(String[] args) {
		int x = 6;
		for(int i = 0;i<x;i++) {
			for(int m =0; m<x;m++) {
				if(i==0 || i==x-1 || m==0 || m==x-1) {
					System.out.println("* ");
				}else {
					System.out.println("_ ");
				}
			}
			System.out.println();
		}
	}

}
