package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'를 누르면 "계속 반복", 'n' 키는 "반복 중단"
		// 그 이외의 키를 누르면 "지원하지 않는 기능"
		// equals()는 String 클래스의 함수이다. 문자열이 같은지 비교할 때 사용
		Scanner sc = new Scanner(System.in);
		
		while(true) {  //무한 반복
			System.out.print("계속 반복할까요?(y/n)");
			String key = sc.nextLine();
			if(key.equals("y") || key.equals("Y")) { //"==" 숫자 비교시 사용
				System.out.println("계속 반복합니다.");
			}else if(key.equals("n") || key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;
			}else {
				System.out.println("지원하지 않는 기능입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
}
