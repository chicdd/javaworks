package generic.box2;

import generic.Apple;

class Box<T>{ //T - 사용하면서 정하는 자료형
	private T type;
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
}


public class GenericBoxTest {

	public static void main(String[] args) {
		//String형 사용
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요!");
		String msg = box1.get();
		System.out.println(msg);
		
		//Integer형 사용
		Box<Integer> box2 = new Box<>();
		box2.set(12);
		Integer num = box2.get();
		System.out.println(num);
		
		//Apple 형 사용
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple());
		Apple apple = box3.get();
		System.out.println(apple);
	}

}
