package interfaceex.shelf;

public interface Queue {  //큐방식 - 선입선출
	
	void enQueue(String title); //리스트의 마지막에 추가
	
	String deQueue();  //리스트의 0번 인덱스 항목 반환
	
	int getSize();  //현재 큐에 있는 개수 반환
} 
