package exercise;

public class DogTest {

	public static void main(String[] args) {
		// Dog 인스턴스 5개 생성
		Dog[] dogList = new Dog[5];
		
		// dog 인스턴스 생성 
		Dog dog1 = new Dog();
		dog1.setName("백구1");
		dog1.setType("진돗개");
		
		Dog dog2 = new Dog();
		dog2.setName("백구2");
		dog2.setType("리트리버");
		
		Dog dog3 = new Dog();
		dog3.setName("백구3");
		dog3.setType("불독");
		
		Dog dog4 = new Dog();
		dog4.setName("백구4");
		dog4.setType("진돗개");
		
		Dog dog5 = new Dog();
		dog5.setName("백구5");
		dog5.setType("진돗개");
		
		//배열에 저장
		dogList[0] = dog1;
		dogList[1] = dog2;
		dogList[2] = dog3;
		dogList[3] = dog4;
		dogList[4] = dog5;
		
		System.out.println("=== 일반 for문 ===");
		for(int i = 0; i < dogList.length; i++) {
			System.out.println(dogList[i].showDogInfo());
		}
		
		System.out.println("=== 향상 for문 ===");
		for(Dog dog : dogList)
			System.out.println(dog.showDogInfo());
	}
}
