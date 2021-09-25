package list;

import java.util.ArrayList;

public class DogList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<>();
		
		//강아지 3마리 생성
		Dog dog1 = new Dog();
		dog1.setName("진도");
		dog1.setType("진돗개");
		
		Dog dog2 = new Dog();
		dog2.setName("백구");
		dog2.setType("리트리버");
		
		Dog dog3 = new Dog();
		dog3.setName("검둥이");
		dog3.setType("불독");
		
		/*Dog dog1 = new Dog("진도", "진돗개");
		Dog dog2 = new Dog("진도", "진돗개");
		Dog dog3 = new Dog("진도", "진돗개");*/
		
		//저장
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		//출력
		for(int i = 0; i < dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
		
	}

}
