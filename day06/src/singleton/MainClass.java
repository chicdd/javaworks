package singleton;

public class MainClass {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar();
		Car sonata2 = factory.createCar();
		Car sonata3 = factory.createCar();
		
		System.out.println("차번 : " + sonata1.getCarNum());
		System.out.println("차번 : " + sonata2.getCarNum());
		System.out.println("차번 : " + sonata3.getCarNum());
	}

}
