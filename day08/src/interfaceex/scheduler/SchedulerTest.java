package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 배분 방식을 선택하세요");
		System.out.println("R : 한명씩 차례로 배분");
		System.out.println("L : 대기가 가장 적은 상담원에게 배분");
		System.out.println("P : 우선 순위가 높은 고객 먼저 배분");
		
		try {
			int ch = System.in.read(); //문자 입력
			
			Scheduler scheduler = null;
			if(ch == 'R' || ch == 'r') {
				scheduler = new RoundRobin();
			}else if(ch == 'L' || ch == 'l') {
				scheduler = new LeastJob();
			}else if(ch == 'P' || ch == 'p') {
				scheduler = new PriorityAllocation();
			}else {
				System.out.println("지원되지 않는 기능입니다.");
				//return;
			}
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}catch(NullPointerException e) {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
