package scoremanage.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "흥부");
		Student s2 = new Student(101, "놀부");
				
		//과목, 점수 생성
		s1.addSubject("국어", 95);
		s1.addSubject("수학", 80);
		s1.addSubject("Java", 78);
		
		s2.addSubject("국어", 90);
		s2.addSubject("수학", 70);
		s2.addSubject("Java", 68);
		
		//출력
		s1.showInfo();
		s2.showInfo();
	}

}
