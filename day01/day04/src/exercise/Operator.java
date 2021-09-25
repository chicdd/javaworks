package exercise;

public class Operator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '%';   //operator == '+'
		int result = 0;
		
		//String operator = "+";  //operator.equals('+')
		
		//if ~else if 코드
		if(operator=='+') {
			result = num1 + num2;
		}else if(operator=='-') {
			result = num1 - num2;
		}else if(operator=='*') {
			result = num1 * num2;
		}else if(operator=='/') {
			result = num1 / num2;
		}else {
			System.out.println("연산자 오류입니다.");
			return;   //강제로 종료
		}

		System.out.println("결과 값은 " + result + "입니다.");
	}
}
