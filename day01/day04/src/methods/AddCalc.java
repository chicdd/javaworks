package methods;

public class AddCalc {

	public static void main(String[] args) {
		// 더하기 함수 호출
		int result = add(20, -20);
		System.out.println("결과 값은 " + result);

	}
	
	public static int add(int n1, int n2) {  //매개변수가 2개
		int sum = n1 + n2;
		return sum;
	}

}
