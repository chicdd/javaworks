package array2d;

public class Array2dCalc {

	public static void main(String[] args) {
		int[][] nums = {
				{1, 2, 3, 4}, 
				{4, 5, 6}
			};
		int i, j;
		int sum = 0;
		double avg;
		int count = 0;  //배열 요소의 개수 저장
		
		//인덱싱
		int x = nums[1][2];
		System.out.println(x);
		
		//전체 출력
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
		}
		System.out.println();
		
		//합계와 평균
		for(i = 0; i < nums.length; i++) {
			for(j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
				count++;  //개수 1증가
			}
		}
		avg = (double)sum / count;
		System.out.println("합계 : " + sum);
		//System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f", avg);
		//서식 문자 : %d - 정수,  %f - 실수, %s - 문자
		
	}

}
