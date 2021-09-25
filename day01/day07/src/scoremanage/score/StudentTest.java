package scoremanage.score;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(101, "ÄáÁã");
		
		s1.koreanSubject("±¹¾î", 91);
		s1.mathSubject("¼öÇĞ", 83);
		
		
		s1.showInfo();
	}

}
