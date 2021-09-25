package classpart;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		//account.ano = "1000";
		//멤버변수의 접근제한자가 private이므로 접근할 수 없음
		
		Account account2 = new Account("100-222-3333", "홍길동", 30000);
		
		account.setAno("100-111-222");
		account.setOwner("이강");
		account.setBalance(50000);
		
		System.out.println("계좌 번호: " + account.getAno());
		System.out.println("계좌주: " + account.getOwner());
		System.out.println("잔액: " + account.getBalance());
		System.out.println("-----------------------------");
		System.out.println("계좌 번호: " + account2.getAno());
		System.out.println("계좌주: " + account2.getOwner());
		System.out.println("잔액: " + account2.getBalance());
	}

}
