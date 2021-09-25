package interfaceex.inherit;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		X xClass = mClass;  //상위 인터페이스 형으로 형변환
		xClass.x();
		
		Y yClass = mClass;
		yClass.y();
		
		System.out.println("다중 상속한 iClass 출력");
		MyInterface iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		
	}

}
