package object;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("콩쥐");
		String name2 = new String("콩쥐");
		
		//메모리 주소 비교
		System.out.println(name1 == name2);
		//저장 값 비교
		System.out.println(name1.equals(name2));
		
		//Book 객체 비교
		Book book1 = new Book(101, "개미");
		Book book2 = new Book(101, "개미");
		//메모리 주소 다르다.
		System.out.println(book1 == book2);
		//저장값 비교 - true가 되어야함.
		System.out.println(book1.equals(book2));
		
	}

}
