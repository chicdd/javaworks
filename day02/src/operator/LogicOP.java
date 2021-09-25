package operator;

public class LogicOP {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10)); 
		//단락 회로 평가 - 논리 연산에서 앞 조건이 false 이면 뒤 조건을 보지 않음
		System.out.println(result);
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);
	}

}
