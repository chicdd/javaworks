package exercise;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();  // 기본생성자로 p1 인스턴스 생성
		p1.age = 40;
		p1.name = "James";
		
		Person p2 = new Person(20, "성춘향");
		
		p1.showInfo();
		p2.showInfo();
		
		/*
		System.out.println("나이 : " + p1.age);
		System.out.println("이름 : " + p1.name);
		System.out.println("결혼여부 : " + p1.isMerried);
		System.out.println("자녀수 : " + p1.numberOfChild);
		*/

	}

}
