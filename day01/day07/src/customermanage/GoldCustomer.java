package customermanage;

public class GoldCustomer extends Customer{
	double saleRatio;  //구매 할인율
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;  //보너스 적립율 2%
		saleRatio = 0.1;    //10%
	}
	
	@Override //메서드 재정의
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);   //구매 할인
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
}
