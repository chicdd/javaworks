package array2d;

public class Score2dArray {

	public static void main(String[] args) {
		// 학생 5명의 국어와 수학 점수 계산
		int[][] score = {
				{91, 70},
				{80, 50},
				{75, 62},
				{93, 85},
				{80, 70}
		};
		int i, j;
		int[] sum = {0, 0};  //국어, 수학
		double[] avg = {0.0, 0.0};
		
		//출력
		System.out.println("국어 수학");
		for(i = 0; i < score.length; i++) {
			for(j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "  ");
			}
			System.out.println();
		}
		
		//합계와 평균
		for(i = 0; i < score.length; i++) {
			sum[0] += score[i][0];
			sum[1] += score[i][1];
		}
		avg[0] = (double)sum[0] / score.length;  //국어 평균
		avg[1] = (double)sum[1] / score.length;  //수학 평균
		
		System.out.println("국어 합계 : " + sum[0]);
		System.out.println("수학 합계 : " + sum[1]);
		System.out.println("국어 평균 : " + avg[0]);
		System.out.println("수학 평균 : " + avg[1]);
	}
}
