package dbconnection;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();
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
