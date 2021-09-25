package car;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//템플릿 메서드 선언
	public final void run() { //상속 받은 클래스는 수정할 수 없음
		startCar();
		drive();
		stop();
		turnOff();
	}
}
