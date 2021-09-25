package list;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		// ArrayList에 Book 객체 3개 생성
		ArrayList<Book> list = new ArrayList<>();
		
		/*/book 인스턴스 생성
		Book book1 = new Book("자바 프로그래밍", "박은종");
		Book book2 = new Book("천개의 파랑", "천선란");
		Book book3 = new Book("태백산맥1", "조정래");
		
		//ArrayList에 저장
		list.add(book1);
		list.add(book2);
		list.add(book3);*/
		
		list.add(new Book("자바 프로그래밍", "박은종"));
		list.add(new Book("천개의 파랑", "천선란"));
		list.add(new Book("태백산맥1", "조정래"));
		
		//조회
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}

	}

}
