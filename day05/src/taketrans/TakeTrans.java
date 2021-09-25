package taketrans;

public class TakeTrans {

	public static void main(String[] args) {
		// 사람과 버스 클래스 사용
		Person p1 = new Person("이강", 10000);
		Person p2 = new Person("박솔", 20000);
		
		Bus bus100 = new Bus(100);
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p1.showInfo();
		p2.showInfo();
		
		//버스의 정보
		bus100.showInfo();

	}

}
