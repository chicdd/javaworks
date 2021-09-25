package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 클래스 사용
		Student s1 = new Student();
		//클래스  인스턴스변수 = new 생성자
		//s1.studentName = "이몽룡"; 접근제어자가 private이므로 불가
		s1.setStudentName("이몽룡");
		//s1.grade = 3;
		s1.setGrade(3);
		
		Student s2 = new Student();
		//s2.studentName = "성춘향";
		s2.setStudentName("성춘향");
		//s2.grade = 1;
		s2.setGrade(1);
		
		Student s3 = new Student("홍길동");
		//s3.grade = 2;
		s3.setGrade(2);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		
		//s1 자체를 출력
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/*
		System.out.println("학생 이름 : " + s1.studentName);
		System.out.println("학년 : " + s1.grade);
		System.out.println("학생 이름 : " + s2.studentName);
		System.out.println("학년 : " + s2.grade);
		*/

	}

}
