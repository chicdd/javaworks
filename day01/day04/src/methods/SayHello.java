package methods;

public class SayHello {

	public static void main(String[] args) {
		//System.out.println("Hello~ Elsa");
		//함수 호출
		sayHello();
		sayHello();
		sayHello2("철수");
		sayHello2("수영");
	}
	
	//이름이 sayHello인 함수(메서드) 정의
	public static void sayHello() {
		System.out.println("Hello~ ");
	}
	
	//매개변수가 있는 함수 정의
	public static void sayHello2(String name) { //매개 변수
		System.out.println("Hello~ " + name);
	}

}
