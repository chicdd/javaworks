package object;

class MyDog{
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return type + " " + name;
	}
}


public class MyDogTest {

	public static void main(String[] args) {
		MyDog dog = new MyDog("�۸���", "������");
		System.out.println(dog);
		
	}

}
