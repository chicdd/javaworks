package methods;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//단어 배열에 저장
		String[] word = {"river", "mountain", "sky", "tree", "flower",
				    "dog", "horse", "cow", "garlic", "onion"};		
		int n = 1;  //문제 번호
		Scanner scan = new Scanner(System.in);
		long start, end;
		
		//영어 타자게임 화면
		System.out.println("영어 타자 게임, 준비되면 엔터");
		scan.nextLine();
		start = System.currentTimeMillis();
		// 타자 게임 실행
		while(n < 3) {
			System.out.println("문제" + n);
			int rand = (int)(Math.random()*word.length);
			String q = word[rand];  //문제 단어 추출
			System.out.println(q);
			
			String ans = scan.nextLine();  //답을 입력
			if(ans.equals(q)) { //단어가 일치하면(정답일때)
				System.out.println("통과!");
				n++;   //새 문제 추가
			}
			else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임 소요 시간은 " + (float)(end-start)/1000 + "초입니다.");
		
		scan.close();
	}

}
