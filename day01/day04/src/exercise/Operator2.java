package exercise;

public class Operator2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		char operator = '-';   //operator == '+'
		int result = 0;
		
		//String operator = "+";  //operator.equals('+')
		
		//switch ~ case 코드
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자 오류입니다.");
			return;
		}
		

		System.out.println("결과 값은 " + result + "입니다.");
	}
}
