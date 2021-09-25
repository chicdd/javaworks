package continueex;

public class ContinueEx {

	public static void main(String[] args) {
		// 반복문 - continue 키워드 사용하기
		//1부터 10까지 중 4, 7을 제외한 수 출력
		for(int i=1; i<=10; i++) {
			if(i==4 || i==7)
				continue;
			System.out.println(i);
		}
		
		//1부터 10중 홀수만 출력
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
