package singleton;

public class Car {
	private int carNum;   //Â÷ ¹øÈ£
	private String brand;
	private static int serialNum = 1000;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
}
