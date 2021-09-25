package exercise;

public class Engineer extends Employee{
	
	private String skillset;
	
	public Engineer(String name, String skillset) {
		super(name);
		this.skillset = skillset;
	}
	//매개 변수가 있는 멤버를 상속 받을 때는 반드시 부모의 멤버변수를 super()로 명시함
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}
