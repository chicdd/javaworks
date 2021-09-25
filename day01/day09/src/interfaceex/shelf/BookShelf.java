package interfaceex.shelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() { //0번 인덱스를 삭제하고 반환
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
	
}
