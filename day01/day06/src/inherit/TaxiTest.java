package inherit;

class Car{
	String brand;
	int cc;    //배기량
	
	public Car(String brand, int cc) {
		this.brand = brand;
		this.cc = cc;
	}
}

//Car를 상속한 Taxi 클래스
class Taxi extends Car{
	int passenger;  //승객
	
	//super 키우드로 상속 받음
	public Taxi(String brand, int cc, int passenger) {
		super(brand, cc);  //부모 멤버는 super() 사용
		this.passenger = passenger;
	}
	
	public void showInfo() {
		System.out.println("차 브랜드 : " + brand + ", cc : " 
	              + cc + ", 승객수: " + passenger);
	}
}

public class TaxiTest {

	public static void main(String[] args) {
		Taxi taxi = new Taxi("Sonata", 2500, 3);
		taxi.showInfo();
		
	}

}
