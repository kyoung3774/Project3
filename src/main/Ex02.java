package main;

public class Ex02 {

	public static void main(String[] args) {

//		int x = 100;
//		int y = x++;
//		int z = x--;
//		
//		System.out.println(x); // 100
//		System.out.println(y); // 100
//		System.out.println(z); // 101
//		System.out.println(x); // 100
		
		int x = 100;
		int y = ++x;
		int z = --x;
		
		System.out.println(x); // 100
		System.out.println(y); // 101
		System.out.println(z); // 100
		System.out.println(x); // 100
	}

}
