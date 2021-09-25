package classpart;

public class Student {
	//학생 클래스 정의 : 멤버변수 + 생성자 + 메서드 
	private String studentName; //이름
	private int grade;          //학년
	
	public Student() { //기본 생성자는 생략 가능
		
	}
	
	public Student(String studentName) {
		this.studentName = studentName;
	}
	
	//학생 정보 메서드
	public void showInfo() {
		System.out.println("이름 : " + studentName);
		System.out.println("학년 : " + grade);
	}
	
	//get(), set() 메서드
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}













