package interfaceex.calculator;

public interface Calculator {
	
	int ERROR = -9999;  //변수 -> 컴파일 시 인터페이스 상수로 바뀜
	
	int add(int n1, int n2);   //추상 메서드 , 더하기
	int subtract(int n1, int n2);  //빼기
	int times(int n1, int n2);
	int divide(int n1, int n2);

}
