package object;

public class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;      //다운캐스팅 - 강제 형변환
			if(this.bookNumber == book.bookNumber);
				return true;
		}
		return false;
	}
	
	//두 객체의 정보가 일치하려면 equals와 hashcode() 재정의 해야함
	@Override
	public int hashCode() {  
		return bookNumber;
	}
	
	
}
