package methods;

public class OneUp2 {
	
	static int x = 1;  //static 변수 = 정적 변수(공유)

	public static int oneUp() {
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		// 1 증가 함수 호출
		System.out.println(oneUp());  // 2
		System.out.println(oneUp());  // 3
		System.out.println(oneUp());  // 4

		//x값 출력
		System.out.println(x);
	}

}
