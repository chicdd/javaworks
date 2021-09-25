package interfaceex.shelf;

public class Main {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		//책 추가
		shelfQueue.enQueue("자바 프로그래밍"); //0
		shelfQueue.enQueue("스프링 부트");    //1
 		shelfQueue.enQueue("안드로이드 프로그래밍"); //2
		
		//책의 개수
		System.out.println(shelfQueue.getSize() + "권");
		
		//책 출력
		System.out.println(shelfQueue.deQueue()); //0
		System.out.println(shelfQueue.deQueue()); //1
	}

}
