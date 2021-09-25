package mathodex;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("두 수의 합: " + calc.add(10, 2));
		System.out.println("두 수의 차: " + calc.sub(10, 2));
		System.out.println("두 수의 곱: " + calc.mul(10, 2));
		System.out.println("두 수의 몫: " + calc.div(10, 2));
	}
	
}
