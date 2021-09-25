package forfor;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 좌석 줄수 계산
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입장객 수 입력 : ");
		int customNum = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		int colNum = sc.nextInt();
		
		int rowNum;
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {
			rowNum = customNum / colNum + 1;
		}
		
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		sc.close();
	}
}
