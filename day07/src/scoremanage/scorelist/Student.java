package scoremanage.scorelist;

import java.util.ArrayList;

import scoremanage.score.Subject;

public class Student {
	int id;
	String stdName;
	ArrayList<Subject> subjectList;
	
	public Student(int id, String stdName) {
		this.id = id;
		this.stdName = stdName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //과목 객체 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);  //과목 객체 추가
	}
	
	public void showInfo() {
		//총점과 평균 계산
		int sum = 0;
		double avg = 0.0;
		for(Subject subject : subjectList) {
			sum += subject.getScorePoint();
			System.out.printf("학생 %s의 %s 과목 점수는 %d점입니다.\n", 
					stdName, subject.getSubjectName(), subject.getScorePoint());
		}
		avg = (double)sum / subjectList.size();
		System.out.printf("학생 %s의 총점은 %d점이고, 평균은 %.2f점입니다.\n", stdName, sum, avg);
	}
	
}
