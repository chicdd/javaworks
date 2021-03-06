package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		//부모 인터페이스 set에 String type의 자료형 사용
		Set<String> set = new HashSet();
		
		//자료 추가
		set.add("감");
		set.add("귤");
		set.add("사과");
		set.add("귤");  //중복 불가
		set.add("포도"); 
		
		//자료의 개수
		System.out.println("총 객체수 : " + set.size());
		
		//출력 - 리스트 형태
		System.out.println(set);
		
		//값 형태 - 출력 : //정해진 순서가 없다. (index 없음)
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String fruit = ir.next();  //자료를 가져옴
			System.out.println(fruit);
		}
	}

}
