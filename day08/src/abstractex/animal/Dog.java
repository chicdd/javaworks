package abstractex.animal;

public class Dog extends Animal{
	//추상 클래스를 상속받으면 반드시 추상메서드를 구현해야함(재정의)
	@Override
	public void cry() {
		System.out.println("왈~ 왈~");
	}
}
