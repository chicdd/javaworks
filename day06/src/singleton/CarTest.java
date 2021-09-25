package singleton;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("차번 : " + car1.getCarNum());
		
		Car car2 = new Car();
		System.out.println("차번 : " + car2.getCarNum());
	}

}
