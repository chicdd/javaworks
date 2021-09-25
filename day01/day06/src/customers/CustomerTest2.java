package customers;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 매개 변수가 있는 생성자로 인스턴스 생성하기
		Customer c1 = new Customer(101, "흥부");
		VIPCustomer vip1 = new VIPCustomer(201, "놀부", 777);
		
		//상품 구매 및 계산
		int price = 20000;
	
		c1.calcPrice(price);
		vip1.calcPrice(price);
		
		// 정보 출력
		System.out.println(c1.showInfo());
		System.out.println(vip1.showInfo());
	}
}
