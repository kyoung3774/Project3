package quiz;

public class Quiz07 {

	public static void main(String[] args) {

		boolean result1 = (1 == 2) || (1 < 2); // true
		boolean result2 = true && false; // false
		boolean result3 = !false; // true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int x = 1;
		int y = 5;
		boolean result4 = (x < y) || (x == y);
		
		System.out.println(result4); // true
	}

}
