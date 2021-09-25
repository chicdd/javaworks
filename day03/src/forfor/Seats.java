package forfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		// 좌석 배치도
		/*int i, j;
		for(i=0; i<5; i++) {
			for(j=1; j<=5; j++) {
				int inc = i*5+j;
				System.out.print("좌석" + inc + " ");
			}
			System.out.println();
		}*/
		
		Scanner sc = new Scanner(System.in);
		int i, j;
		
		System.out.print("입장객 수 입력 : ");
		int customNum = sc.nextInt();
		
		System.out.print("좌석 열 수 입력 : ");
		int colNum = sc.nextInt();
		
		int rowNum;
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else {  //나머지가 있으면 1행이 더 필요함
			rowNum = customNum / colNum + 1;
		}
		
		for(i=0; i<rowNum; i++) {
			for(j=1; j<=colNum; j++) {
				int seats = i*colNum+j;
				System.out.print("좌석" + seats + " ");
				if(seats == customNum)
					break;
			}
			System.out.println();
		}
		
		sc.close();
	}
}
