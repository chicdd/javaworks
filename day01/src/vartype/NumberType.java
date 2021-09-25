package vartype;

public class NumberType {

	public static void main(String[] args) {
		//정수 자료형의 종류 및 크기
		//byte 자료형의 크기는 1Byte이므로 범위(-128~ 127)
		byte bData1 = -128;
		//byte bData2 = 128; //범위 초과 오류
		
		//short 자료형의 크기는 2Byte (-32,768 ~ 32,767)
		short sData1 = 32767;
		//short sData2 = 32768;
		
		System.out.println(bData1);
		System.out.println(sData1);
		
		//기본 자료형 - int는 4바이트 (약 ~21억 ~ 21억)
		int iNum = 1234567890;
		//int iNum2 = 12345678901;
		
		//long형 - 큰 숫자 8바이트 ('L'이나 'l'을 끝에 붙임)
		long lNum = 1234567890123L;
		System.out.println(iNum);
		System.out.println(lNum);
	}

}
