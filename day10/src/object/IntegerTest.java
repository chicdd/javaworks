package object;

import java.util.ArrayList;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer num1 = new Integer(100);
		Integer num1 = 100;  //Integer > int (오토박싱)
		int num2 = 200;
		int sum = num1.intValue() + num2;
		//num1 - 언박싱(Integer -> int형)
		System.out.println(num1);
		System.out.println(sum);
		
		//valueOf() -> 정수나 문자열을 Integer 클래스로 변환
		Integer n1 = Integer.valueOf("200");
		System.out.println(n1);
		
		//parseInt() -> 문자열을 숫자로 변경함
		int n2 = Integer.parseInt("300");
		System.out.println(n2);
		
		//ArrayList에 Integer 타입의 자료를 저장
		ArrayList<Integer> numList = new ArrayList<>();
		
		//자료 추가
		numList.add(1);
		numList.add(4);
		numList.add(8);
		
		//출력
		for(Integer num : numList)
			System.out.println(num);
	}

}
