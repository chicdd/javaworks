package object;

public class BookTest {

	public static void main(String[] args) {
		
		String name = new String("ÈïºÎ");
		System.out.println(name);
		System.out.println(name.toString());
		
		
		Book book = new Book(100, "¹Ì»ý1");
		System.out.println(book);
		System.out.println(book.toString());
		

	}

}
