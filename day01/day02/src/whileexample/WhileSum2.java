package whileexample;

public class WhileSum2 {

	public static void main(String[] args) {
		// 1부터 10까지 합계 구하기
		// break를 사용 -> 반복 조건문
		
		int n = 1;
		int sum = 0;
		
		while(true) {  //반복 조건문
			sum += n;
			System.out.println("n=" + n + ", sum=" + sum);
			n++;
			if(n > 10)
				break;
		}
		System.out.println("1부터 10까지의 합: " + sum);	
	}

}
