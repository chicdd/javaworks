package vartype;

public class CharType {

	public static void main(String[] args) {
		/*
		 * 문자 자료형 - char, String
		 char는 2바이트 (-32,768 ~ 32,767) */
		char ch1 = 'A';
		char ch2 = 66;
		
		System.out.println(ch1);  //A
		System.out.println(ch2);  //B
		
		//'A'의 아스키코드 
		System.out.println((int)ch1); //65
		System.out.println((int)ch2); //66
		
		//'한'의 유니코드
		char ch3 = '한';
		char ch4 = '\uD55C';  //유니코드 16진수
		char ch5 = '글';
		char ch6 = '\uAE00';
		
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);

	}

}
