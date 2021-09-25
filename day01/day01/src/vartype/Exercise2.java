package vartype;

public class Exercise2 {

	public static void main(String[] args) {
		int n1 = 10;
		double n2 = 2.0;
		//float n2 = 2.0F;
		
		int result1 = (int)(n1 + n2);
		int result2 = (int)(n1 - n2);
		int result3 = (int)(n1 * n2);
		int result4 = (int)(n1 / n2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
