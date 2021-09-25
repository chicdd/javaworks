package forexample;

public class CharsetTest {

	public static void main(String[] args) {
		// 문자 세트 출력
		char ch;
		for(ch=65; ch<123; ch++) {  //아스키 코드 출력
			System.out.print(ch + " ");
		}
		System.out.println(); //한줄 넣기
		
		for(ch=12593; ch<12686; ch++) {  //유니 코드
			System.out.print(ch + " ");
		}

	}

}
