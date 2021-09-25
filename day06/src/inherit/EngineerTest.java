package inherit;

class Person{
	String name;
	int age;
	
	Person(){}
}

//Person을 상속한 Engineer 클래스
class Engineer extends Person{ 
	int companyId;  //사번
}

public class EngineerTest {

	public static void main(String[] args) {
		Engineer eng = new Engineer();
		
		eng.name = "이봉구";  //부모 멤버에 접근
		eng.age = 30;       //부모 멤버에 접근
		eng.companyId = 13; //자기 멤버에 접근
		
		System.out.println("이름 : " + eng.name);

	}

}
