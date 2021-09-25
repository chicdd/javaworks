package constantEx;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수 선언하고 사용하기
		final int MAX_NUM = 100;
		
		//MAX_NUM = 1000;  상수는 수정할 수 없다.
		
		System.out.println(MAX_NUM);
		
		//원의 넓이를 계산하는 프로그램 
		// 원의 넓이 = pi * 반지름 * 반지름
		// 상수 및 변수 선언
		final double PI = 3.14;
		int radius = 5;
		double area;
		
		//계산
		area = PI * radius * radius;
		
		//출력
		System.out.println(area);
	}
}
