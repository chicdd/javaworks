package customermanage;

public class Customer {
	protected int customerId;        //고객 아이디
	protected String customerName;   //고객 이름
	protected String customerGrade;  //고객 등급
	int bonusPoint;        //보너스 포인트
	double bonusRatio;     //보너스 적립율
	
	public Customer() {
		initCustomer();
	}
	
	//매개 변수가 있는 생성자
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		initCustomer();
	}
	
	public void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;  //1%
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	//보너스 포인트 계산
	public int calcPrice(int price) { //보너스포인트 = 가격 * 보너스적립율
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
	//정보 출력
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + 
				"이고, 보너스 포인트는 " + bonusPoint + "점입니다.";
	}
	
	
	
}
