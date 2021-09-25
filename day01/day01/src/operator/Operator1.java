package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 변수의 교환
		int x = 0;
		int y = 1;
		int temp;  //임시로 저장할 변수
		
		System.out.println("=== 교환전 ===");
		// '+' 문자도 연결, 숫자 더하기
		System.out.println("x=" + x + ", y=" + y);
		
		//교환 처리
		//x값을 temp에 저장
		temp = x;
		//y값을 x에 저장
		x = y;
		//temp 값을 y에 저장
		y = temp;
		
		System.out.println("=== 교환후 ===");
		// '+' 문자도 연결, 숫자 더하기
		System.out.println("x=" + x + ", y=" + y);

	}

}
