package arrays;

public class NumberArray {

	public static void main(String[] args) {
		// 배열 선언
		// 정수형 numbers 이름의 배열 공간(크기) 3개 생성
		int[] numbers = new int[3];
		int sum = 0;
		
		System.out.println("배열의 개수: " + numbers.length);
		
		//값을 접근 - 저장
		//자료형의 초기값 - 객체(null), 정수(0), 문자("")
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		//numbers[3] = 40;
		
		//출력(조회)
		System.out.println("numbers[0]=" + numbers[0]);
		System.out.println("numbers[1]=" + numbers[1]);
		System.out.println("numbers[2]=" + numbers[2]);

		//배열은 for문과 연동해서 출력
		for(int i=0; i<numbers.length; i++) { //0, 1, 2
			sum += numbers[i];
			System.out.println(numbers[i]);
		}
		System.out.println("합계 : " + sum);
	}

}
