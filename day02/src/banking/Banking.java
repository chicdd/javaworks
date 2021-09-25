package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무 프로그램
		Scanner sc = new Scanner(System.in);
		boolean run = true;  //프로그램 실행와 종료를 저장하는 변수
		int balance = 0;  // 초기 잔액
		
		while(run) {
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.print("선택>");
			
			int selNum = sc.nextInt();
			
			switch(selNum) {
			case 1:
				System.out.print("예금액>");
				int money = sc.nextInt();
				balance += money;
				System.out.println("입금 처리 되었습니다.");
				break;
			case 2:
				while(true) {
					System.out.print("출금액>");
					money = sc.nextInt();
					if(money > balance) {
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요");
					}else {
						balance -= money;
						System.out.println("출금 처리 되었습니다.");
						break;
					}
				} //while 닫기
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
		sc.close();
	} //main() 닫기
}//class 닫기
