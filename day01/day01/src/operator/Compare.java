package operator;

public class Compare {

	public static void main(String[] args) {
		// 비교 연산자
		int n1 = 7;
		int n2 = 3;
		boolean result1, result2, result3;
		/*
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);*/
		
		//논리 연산자
		// boolean 자료형은 true/false만 저장 가능
		// &&-논리곱 연산자, ||-논리합 연산자, !-논리부정 연산자
		result1 = (n1 < n2) && (n1 != n2);
		System.out.println(result1);
		
		result2 = (n1 < n2) || (n1 != n2);
		System.out.println(result2);
		
		result3 = !(n1 < n2);
		System.out.println(result3);
		
		
		//나이를 비교해서 boolean 변수에 저장하기
		/*int myAge = 27;
		boolean value = myAge > 25;    //true
		System.out.println(value);*/
	}

}
