package methods;

public class ParamArray {

	//합계를 계산하는 메서드 정의(매개변수가 배열)
	public static int add(int[] score) {
		int sum = 0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		//add 메서드 호출
		int result = add(nums);
		double avg = (double)result / nums.length;
		
		System.out.println("합계: " + result);
		System.out.println("평균: " + avg);

	}
}
