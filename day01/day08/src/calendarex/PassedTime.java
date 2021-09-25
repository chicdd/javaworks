package calendarex;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		//시작일 ~ 종료일 날짜 계산
		Calendar day1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		//시작일 설정, 월은 1을 빼고 설정
		day1.set(2021, 7, 14);
		
		//날짜 출력
		String startDay = day1.get(Calendar.YEAR) + "년 " 
		      + (day1.get(Calendar.MONTH) + 1) + "월 " + day1.get(Calendar.DATE) + "일";
		
		String Today = today.get(Calendar.YEAR) + "년 " 
			      + (today.get(Calendar.MONTH) + 1) + "월 " + today.get(Calendar.DATE) + "일";
		
		System.out.println("개강일 : " + startDay);
		System.out.println("현재 : " + Today);
		
		//날짜 계산
		long passedTime = today.getTimeInMillis() - day1.getTimeInMillis(); //밀리초
		//일로 환산
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("♣ 오늘까지 몇 일? ♣");
		System.out.println("개강 이후 " + passedTime + "일이 지났습니다.");
	}

}
