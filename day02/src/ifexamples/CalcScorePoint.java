package ifexamples;

import java.util.Scanner;

public class CalcScorePoint {

	public static void main(String[] args) {
		// 학점 계산 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		
		//int score = 85; 
		System.out.print("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		char grade = ' '; //공백 문자로 초기화
		//String str = "";
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score < 90 && score >= 80) {
			grade = 'B';
		}else if(score < 80 && score >= 70) {
			grade = 'C';
		}else if(score < 70 && score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade + "학점 입니다.");
		sc.close();
	}

}
