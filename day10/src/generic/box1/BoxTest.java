package generic.box1;

import generic.Apple;

class Box{
	private Object obj;
	
	public void set(Object obj) {
		this.obj = obj;
	}
	
	public Object get() {
		return obj;
	}
	
}

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("행운을 빌어요!"); //문자열 저장
		String msg = (String) box.get();  //출력할 때는 형변환 해야함
		System.out.println(msg);
		
		//객체 타입 저장
		box.set(new Apple());
		Apple apple = (Apple)box.get();
		System.out.println(apple);
	}

}
