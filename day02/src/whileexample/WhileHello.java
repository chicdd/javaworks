package whileexample;

public class WhileHello {

	public static void main(String[] args) {
		// Hello~ 10번 반복
		int n = 1; //초기값

		while(n < 11) { //조건값(종료)
			System.out.println("Hello~");
			n++;   //증감값 - 1증가
		}
		
		// 자연수 1 ~ 10까지 출력하기
		int i = 1;
		while(i < 101) {
			System.out.println(i);
			i++;
		}
		
	} //main 닫기
}//class 닫기
