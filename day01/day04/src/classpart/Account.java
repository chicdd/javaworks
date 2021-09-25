package classpart;

public class Account {
	private String ano;    //계좌번호
	private String owner;  //계좌주
	private int balance;   //잔액
	
	public Account() {}
	
	//매개변수가 있는 생성자(외부 입력)
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//set+멤버변수() 메서드 - 외부 입력
	public void setAno(String ano) {
		this.ano = ano;   
	}
	
	//get+멤버변수() - 출력
	public String getAno() {
		return ano;
	}
	
	//계좌주 메서드
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	//잔액 메서드
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
}
