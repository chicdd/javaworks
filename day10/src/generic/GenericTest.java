package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("grape");
		list.add("egg");
		list.add("gcoffee");
		
		String str1 = list.get(1); //egg 가져옴
		System.out.println(str1);
		//리스트 형태로 출력
		System.out.println(list);
		
		//왜 제네릭 프로그래밍을 하는가?  타입을 정하지 않으면 Object형
		ArrayList cart = new ArrayList();
		cart.add("grape");
		cart.add("egg");
		cart.add("coffee");
		
		String str2 = (String)list.get(1);
		System.out.println(str2);
		
		
	}

}
