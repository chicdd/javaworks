package exercise;

public class Person {
	int age;           //나이
	String name;       //이름

	public Person() {}   //기본 생성자인데 다른 생성자가 있으면 생략불가
	
	public Person(int age, String name) { //나이와 이름인 매개변수인 생성자
		this.age = age;
		this.name = name;
	}
	
	//정보 메서드
	public void showInfo() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);

	}
}
