package classpart;

public class Number {
	
	int x;
	
	public Number() {  //생성자 - 클래스 이름과 같고, 형태는 함수형(메서드), return이 없음
		x = 10;
		System.out.println("초기값을 설정합니다.");
	}
	

	public static void main(String[] args) {
		// 생성자 알아보기
		Number myNumber = new Number();
		
		System.out.println(myNumber.x);

	}

}
