package classInfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		
		System.out.println("===== 클래스 이름 가져오기 =====");
		//방법 1
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		//방법 2
		Class pClass2 = Class.forName("java.lang.String");
		System.out.println(pClass2.getName());
		
		//Person 클래스 정보
		System.out.println("=== 생성자 정보 ===");
		Constructor[] cons = pClass1.getConstructors();
		for(Constructor c : cons)
			System.out.println(c);
		
		System.out.println("=== 맴버변수 정보 ===");
		Field[] fields =  pClass1.getDeclaredFields();
		for(Field field : fields)
			System.out.println(field);
		
		System.out.println("=== 생성자 정보 ===");
		Method[] methods = pClass1.getMethods();
		for(Method method : methods)
			System.out.println(method);
	}

}
