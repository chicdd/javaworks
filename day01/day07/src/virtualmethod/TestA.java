package virtualmethod;

public class TestA {
	
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}

	public static void main(String[] args) {
		//인스턴스는 다른 주소이고 메서드는 같은 주소에 위치한다.
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();

	}

}
