package car;

public class Main {

	public static void main(String[] args) {
		System.out.println("==== 자율 주행하는 자동차 ====");
		Car aiCar = new AICar();
		aiCar.run();
		
		System.out.println("==== 사람이 운전하는 자동차 ====");
		Car manCar = new ManualCar();
		manCar.run();
	}

}
