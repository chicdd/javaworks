package staticsample;

public class Employee {
	int id;
	String name;
	static int serialNum = 1000;  //기준 번호
	
	public void setName(String name) {
		this.name = name;
	}
}
