package customermanage;

public class CustomerTest {

	public static void main(String[] args) {
		// 자동 형변환 -> 다형성으로 구현
		//부모 클래스로 인스턴스 생성
		Customer c1 = new Customer(101, "흥부");
		Customer vip1 = new VIPCustomer(102, "놀부", 777);
		
		int price = 10000;
		
		c1.calcPrice(price);
		vip1.calcPrice(price);
		
		System.out.println(c1.showInfo());
		System.out.println(vip1.showInfo());

	}

}
