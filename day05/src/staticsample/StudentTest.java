package staticsample;

public class StudentTest {

	public static void main(String[] args) {
		//인스턴스 생성
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		//이름 입력
		s1.setName("이대한");
		s2.setName("장민국");
		s3.setName("양만세");
		
		//출력
		System.out.println(s1.getName() + " 학번 : " + s1.getId());
		System.out.println(s2.getName() + " 학번 : " + s2.getId());
		System.out.println(s3.getName() + " 학번 : " + s3.getId());
	}

}
