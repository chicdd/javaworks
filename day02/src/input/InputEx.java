package input;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		// 입력 처리
		Scanner sc = new Scanner(System.in);
		// 클래스 오브젝트 = new 생성자
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();  //nextLine()은 문자 입력 함수
		System.out.println("당신의 이름은 " + name + "이군요.");
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();  //nextInt() 숫자 입력
		System.out.println("당신의 나이는 " + age + "세 이군요.");
		
		sc.close();
	}
}
