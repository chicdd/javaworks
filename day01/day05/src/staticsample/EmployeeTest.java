package staticsample;

public class EmployeeTest {

	public static void main(String[] args) {
		//사원 번호 증가, static 변수를 사용하면 클래스 이름으로 직접 접근
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		//첫번째 사원
		e1.setName("이대한");
		//e1.serialNum++;  //1증가
		Employee.serialNum++;
		System.out.println("사번 : " + Employee.serialNum); //1001
		
		//두번째 사원
		e2.setName("장민국");
		//e2.serialNum++;     접근 방식 변경
		Employee.serialNum++;
		System.out.println("사번 : " + Employee.serialNum);
		
		//세번째 사원
		e3.setName("양만세");
		Employee.serialNum++;
		System.out.println("사번 : " + Employee.serialNum);
	}

}
