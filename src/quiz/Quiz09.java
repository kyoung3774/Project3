package quiz;

public class Quiz09 {

	public static void main(String[] args) {

		char ch = (5>3) ? '오':'삼';
		System.out.println(ch);
		
		int x = 10;
		int y = 20;
		int result = (x>10) ? y+10:y-10; // (false) ? true:false
		System.out.println(result); // result = y-10
	}

}
