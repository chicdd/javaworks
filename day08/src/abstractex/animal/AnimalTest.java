package abstractex.animal;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.eat();
		dog.cry();
		dog.sleep();
		System.out.println("============");
		
		cat.eat();
		cat.cry();
		cat.sleep();
		
	}

}
