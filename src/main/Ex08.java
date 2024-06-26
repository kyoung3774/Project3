package main;

public class Ex08 {

	public static void main(String[] args) {

		int moterAge = 55;
		int faterAge = 50;
		
		String str = (moterAge > faterAge) ? "엄마":"아빠";
		System.out.println(str);
		
		char ch = (moterAge > faterAge) ? 'm':'f';
		System.out.println(ch);
		
		int i = (moterAge > faterAge) ? 1 : 2;
		System.out.println(i);
		
		boolean bool = (moterAge > faterAge) ? true:false;
		System.out.println(bool);
	}

}
