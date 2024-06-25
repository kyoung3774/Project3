package quiz;

public class Quiz04 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		double totalScore = mathScore + engScore + korScore;
		double avgScore = totalScore / 3;
		
		System.out.println("총점: " + totalScore);
		System.out.println("평균: " + Math.round(avgScore * 10) / 10.0);
	}

}
