package exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// 다중 try ~ catch문
		try {
			String name = null;
			int num1 = 10, num2 = 0;
			
			int num3 = num1 / num2;
			System.out.println(num3);
			
			System.out.println(name.toString());
			//null 객체에 접근해서 오류 발생 - 실행 오류(Runtime Error)
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
