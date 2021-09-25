package ifexamples;

public class CalcCharge {

	public static void main(String[] args) {
		// 놀이공원 입장료 계산하기 - 미취학아동, 초등, 중.고등, 일반인
		// 변수 선언
		int age = 15;
		int charge = 0;
		
		// 조건 처리
		if(age < 8) {  //비교 연산의 결과 - boolean(true/false)
			System.out.println("미취학 아동입니다.");
			charge = 1000; 
		}else if(age >= 8 && age < 14) { // true && true
			System.out.println("초등학생입니다.");
			charge = 2000;
		}else if(age >= 14 && age < 20) {
			System.out.println("중.고등학생 입니다.");
			charge = 2500;
		}else {  // age >= 20
			System.out.println("일반인 입니다.");
			charge = 3000;
		}
		System.out.println("입장료는 " + charge + "원입니다.");
	}
}
