package exercise;

public class NumberArray {

	public static void main(String[] args) {
		// 배열의 길이가 5인 정수형 배열 선언
		//int[] numbers = new int[5];
		int sum = 0;
		
		//짝수 저장
		/*numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		numbers[3] = 8;
		numbers[4] = 10;*/
		
		int[] numbers = {2, 4, 6, 8, 10};
		
		//합계 계산
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println("합계 : " + sum);
	}

}
