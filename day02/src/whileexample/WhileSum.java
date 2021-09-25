package whileexample;

public class WhileSum {

	public static void main(String[] args) {
		// 1부터 10까지 합계 구하기
		
		int num = 1;
		//num += 2;
		//num += 3;
		
		int sum = 0;  //합계를 저장할 변수
		while(num <= 10) {
			sum += num;  //누적 합계, sum = sum + num
			System.out.println("num=" + num + ", sum= " + sum);
			num++;
		}
		System.out.println("1부터 10까지의 합은" + sum +"입니다.");
		System.out.println("num=" + num);
	}

}
