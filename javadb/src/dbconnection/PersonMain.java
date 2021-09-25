package dbconnection;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
		/*Person p1 = new Person();
		p1.setUserId("river");
		p1.setUserPw("r1234567");
		p1.setName("한강");
		p1.setAge(27);
		
		dao.create(p1);*/
		
		
		
		//자료 삭제
		dao.delete("lee123");
		
		ArrayList<Person> list = dao.getListAll();
		
		for(int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			String id = p.getUserId();
			String pw = p.getUserPw();
			String name = p.getName();
			int age = p.getAge();
			
			System.out.println(id + ", " + pw + ", " + name + ", " + age);
		}
	}

}
