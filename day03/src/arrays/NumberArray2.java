package arrays;

public class NumberArray2 {

	public static void main(String[] args) {
		// 배열의 선언과 사용 - 중괄호 블럭안에 초기화 함
		int[] arr = {1, 2, 3, 4};
		int i;
		int sum = 0;
		double avg = 0.0;
		
		//배열의 크기
		System.out.println(arr.length);
		
		//arr[2]의 값 출력
		System.out.println(arr[2]);
		
		//arr[2] 값을 수정(변경)
		arr[2] = 6;
		System.out.println(arr[2]);
		
		//전체 출력
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//합계
		for(i=0; i<arr.length; i++) {
			sum += arr[i];  //sum = sum + arr[i]
		}
		System.out.println("합계: " + sum);
		
		//평균
		avg = (double)sum / arr.length;  //평균 = 합계 / 개수 : 반드시 형변환
		System.out.println("평균: " + avg);

	}

}
