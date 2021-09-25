package vartype;

public class NumberType2 {

	public static void main(String[] args) {
		// 실수 자료형의 크기 및 범위
		//float는 4바이트 ('F'나 'f'를 붙여야함), double(기본)은 8바이트
		float fData = 2.54F;
		double dData = 3.1415;
		
		System.out.println(fData);
		System.out.println(dData);
		
		//정밀도 측정
		float fData2 = 0.12345678F; //소수 8자리까지 측정
		double dData2 = 0.1234567890123456; //소수 16자리까지 가능
		
		System.out.println(fData2);
		System.out.println(dData2);
		
	}

}
