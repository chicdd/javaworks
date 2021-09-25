package arraysample;

public class ObjectCopy2 {

	public static void main(String[] args) {
		// 객체의 얕은 복사
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		//array1에 자료 저장
		array1[0] = new Book("자바프로그래밍 입문", "박은종");
		array1[1] = new Book("점프 투 파이썬", "박응용");
		array1[2] = new Book("천개의 파랑", "천선란"); 
		
		//array1[0]를 수정
		array1[0].setBookName("미생1");
		array1[0].setAuthor("윤태호");
		
		//array2에 복사
		for(int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}
		
		System.out.println("=== array1 출력 ===");
		for(int i = 0; i < array1.length; i++) {
			array1[i].showInfo();
		}
		
		System.out.println("=== array2 출력 ===");
		for(int i = 0; i < array2.length; i++) {
			array2[i].showInfo();
		}
	}

}
