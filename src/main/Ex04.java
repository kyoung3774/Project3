package main;

public class Ex04 {

	public static void main(String[] args) {

		int mathScore = 93; //수학점수
		int engScore = 70; //영어점수
		
		int totalScore = mathScore + engScore;
		System.out.println("총점:" + totalScore);
		
		int avgScore1 = totalScore/2; // int/int(정수/정수)
		System.out.println("평균(int):" + avgScore1);
		
		double avgScore2 = totalScore/2; // int/int(정수/정수)
		System.out.println("평균(int):" + avgScore2);
	
		double avgScore3 = totalScore/2.0; // int/double(정수/실수)
		System.out.println("평균(double):" + avgScore3);
	}

}
