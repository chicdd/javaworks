package array2d;

public class Array2D {

	public static void main(String[] args) {
		// 이차원 배열 생성과 사용
		int[][] a = new int[2][3];
		int i, j;
		
		System.out.println("배열의 길이(행) : " + a.length + "개");
		System.out.println("배열의 길이(열) : " + a[0].length + "개");
		System.out.println("배열의 길이(열) : " + a[1].length + "개");
		
		//저장
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		//출력
		for(i = 0; i < a.length; i++) {
			for(j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
