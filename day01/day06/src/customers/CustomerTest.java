package customers;

public class CustomerTest {

	public static void main(String[] args) {
		//기본 생성자로 인스턴스 생성하기
		Customer c1 = new Customer();   //Customer 인스턴스 생성
		VIPCustomer vip1 = new VIPCustomer();  //VIPCustomer 인스턴스 생성
		
		c1.setCustomerName("신사임당");
		vip1.setCustomerName("이순신");
		vip1.setAgentId(123);
		
		//보너스 포인트 계산
		int price = 10000;
		c1.calcPrice(price);
		
		int saledPrice = vip1.calcPrice(price); //할인된 가격
		
		//vip의 물건 가격 출력
	
		
		//정보 출력
		System.out.println(c1.showInfo());
		System.out.println(vip1.getCustomerName() + "님의 구매 가격은 " + saledPrice + "원입니다.");
		System.out.println(vip1.showInfo());
	}

}
