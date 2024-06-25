package quiz;

public class Quiz02 {

	public static void main(String[] args) {

		int x = 10;
		
		int y = 20;
		
		int result = (x++) + (--y); // result:10(x) + 19(y) = 29 / x: 11 / y:19
		
		System.out.println(result);
		System.out.println(x);
		System.out.println(y);
	}

}
