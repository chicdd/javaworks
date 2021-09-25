package customermanage;

import java.util.ArrayList;

public class CustomerTest2 {

	public static void main(String[] args) {
		// ArrayList를 사용하여 다형성으로 구현하기
		//현개 고객 5명 : SILVER-2명, GOLD-2명, VIP - 1명
		ArrayList<Customer> cList = new ArrayList<>();
		
		//실버 2명 생성
		Customer lee = new Customer(1001, "이순신");
		Customer shin = new Customer(1002, "신사임당");
		Customer hong = new GoldCustomer(1003, "홍길동");
		Customer kang = new GoldCustomer(1004, "강감찬");
		Customer king = new VIPCustomer(1005, "세종대왕", 1234);
		
		//리스트에 추가
		cList.add(lee);
		cList.add(shin);
		cList.add(hong);
		cList.add(kang);
		cList.add(king);
		
		
		
		System.out.println("====== 구매 가격과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer c : cList) {
			int cost = c.calcPrice(price);  //구매 가격
			System.out.println(c.getCustomerName() + "님이 " + cost + "원 지불했습니다.");
		}
		
		System.out.println("======== 고객 정보 출력 ============");
		for(Customer c : cList)
			System.out.println(c.showInfo());

	}

}
