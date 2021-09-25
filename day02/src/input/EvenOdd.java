package input;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// 짝수/홀수 판별 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		String result = "";
		
		result = (num % 2 == 0) ? "짝수입니다" : "홀수입니다";
		//조건 연산자
		/*
		if(num % 2 == 1) {
			result = "홀수입니다.";
		}else {
			result = "짝수입니다.";
		}*/
		
		System.out.println(result);
		sc.close();
	}
}
