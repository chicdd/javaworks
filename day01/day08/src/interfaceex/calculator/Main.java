package interfaceex.calculator;

public class Main {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		int num1 = 10;
		int num2 = 0;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.subtract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));

	}
}
