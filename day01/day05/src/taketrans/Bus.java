package taketrans;

public class Bus {
	int busNumber;    //버스 번호
	int passenger;    //승객
	int money;        //수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//사람을 태우다
	public void take(int money) {
		this.money += money;  //요금 누적
		passenger++;          //승객수 1 증가
	}
	
	//정보 출력
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 수입은 " + money 
				+ "원 이고, 승객수는 " + passenger + "명 입니다.");
	}
	
}
