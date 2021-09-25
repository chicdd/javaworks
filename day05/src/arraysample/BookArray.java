package arraysample;

public class BookArray {

	public static void main(String[] args) {
		//Book 객체 배열 5개 생성
		Book[] library = new Book[5];
		
		//출력
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		//저장
		library[0] = new Book("자바프로그래밍 입문", "박은종");
		library[1] = new Book("점프 투 파이썬", "박응용");
		library[2] = new Book("천개의 파랑", "천선란");
		library[3] = new Book("미생1", "윤태호");
		library[4] = new Book("미생2", "윤태호");
		
		//향상 for문
		for(Book book : library) {
			book.showInfo();
		}
	}

}
