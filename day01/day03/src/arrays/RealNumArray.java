package arrays;

public class RealNumArray {
	public static void main(String[] args) {
		//실수형 배열 선언 및 연산하기
		double[] data = new double[5];
		double sum = 0.0;  //총합
		double times= 0.0;  //총곱셈
		
		//값을 저장
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//조회
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		//합계
		for(int i=0; i<data.length; i++) {
			sum += data[i];
			times *= data[i];
		}
		System.out.println("합계: " + sum);
		System.out.println("곱: " + times);
	}
}
