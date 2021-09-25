package classpart;

public class Number2 {
	
	int x;
	
	public Number2(int y) { //매개변수 값을 멤버변수에 대입
		x = y;
		System.out.println("매개변수 값을 멤버변수에 저장합니다.");
	}

	public static void main(String[] args) {
		// Number2 사용
		Number2 num1 = new Number2(5);
		Number2 num2 = new Number2(-12);
		
		System.out.println("x = " + num1.x);
		System.out.println("x = " + num2.x);
	}

}
