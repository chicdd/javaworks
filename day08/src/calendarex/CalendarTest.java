package calendarex;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println("=== 날짜 설정하기 ===");
		System.out.println("올해의 연도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11) : " + today.get(Calendar.MONTH));
		System.out.println("일 : " + today.get(Calendar.DATE));
		System.out.println("요일 : " + today.get(Calendar.DAY_OF_WEEK));
		//1-일, 2-월, ... 6-금, 7-토
		
		System.out.println("=== 시간 설정하기 ===");
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~11) : " + today.get(Calendar.SECOND));
		System.out.println("오전(0), 오후(1) : " + today.get(Calendar.AM_PM));
		
		//지금까지의 시간 - 1970. 1. 1 자정이후 밀리초(1/1000)로 환산 - getTimeInMillis()
		System.out.println("=== 현재까지의 시간 ===");
		System.out.println(today.getTimeInMillis());
		System.out.println("초로 환산 : " + today.getTimeInMillis()/1000);
		System.out.println("일로 환산 : " + today.getTimeInMillis()/(24*60*60*1000));
		
	}

}
