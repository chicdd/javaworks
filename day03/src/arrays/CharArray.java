package arrays;

public class CharArray {

	public static void main(String[] args) {
		// 문자열 배열 선언 및 사용
		//String[] cars = new String[4];
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//인덱싱 - "K7"
		System.out.println(cars[3]);
		
		//"Morning"를 "BMW"로 변경
		cars[0] = "BMW";
		System.out.println(cars[0]);
		
		//전체 출력
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i] + " ");
		}
		System.out.println();
		
		System.out.println("==향상 for문==");
		for(String car : cars) { //자료형 변수 : 배열이름
			System.out.print(car + " ");
		}
		System.out.println();
		
		//알파벳 대문자 배열에 저장
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//ch++;
		
		//System.out.println(alphabets[0]);
		//System.out.println(ch);
		
		//배열에 알파벳을 저장
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.println((int)alphabets[i] + ", " + alphabets[i]);
		}

	}

}
