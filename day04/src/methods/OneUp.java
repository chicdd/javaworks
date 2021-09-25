package methods;

public class OneUp {
	
	//x 는 지역변수 - 블럭 벗어나면 소멸
	public static int oneUp(int x) {
		x = x + 1;
		return x;
	}

	public static void main(String[] args) {
		// 1증가 함수 호출
		int num1 = oneUp(1);  //x가 2를 반환하고 x메모리 소멸
		num1 = oneUp(1);  //2
		num1 = oneUp(1);  //2
		System.out.println(num1);
		
		//x를 출력 - x는 선언이 안됨. undefined
		//System.out.println(x);

	}

}
