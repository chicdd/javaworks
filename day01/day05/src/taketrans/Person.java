package taketrans;

public class Person {
	String name;
	int age;
	int money;    //가진 돈
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//버스를 타다
	public void takeBus(Bus bus) {  //참조형 클래스를 매개변수로 사용
		bus.take(1200);
		this.money -= 1200;
	}
	
	//정보 출력
	public void showInfo() {
		System.out.println(name + "님의 남은 돈은 " + money + "원 입니다.");
	}
}
