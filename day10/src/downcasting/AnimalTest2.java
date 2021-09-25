package downcasting;

import java.util.ArrayList;

public class AnimalTest2 {

	public static void main(String[] args) {
		ArrayList<Animal> animalList = new ArrayList<>();
		
		//객체 생성
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		//객체 추가
		animalList.add(human);
		animalList.add(eagle);
		animalList.add(tiger);
		
		//출력
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			animal.move();
		}
		
		System.out.println("원래의 형으로 다운 캐스팅");
		for(int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human h = (Human)animal;
				h.readBook();
			}else if(animal instanceof Eagle) {
				Eagle e = (Eagle)animal;
				e.flying();
			}else if(animal instanceof Tiger) {
				Tiger t = (Tiger)animal;
				t.hunting();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
		
	}

}
