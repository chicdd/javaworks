package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// 4단 출력 - 1행 1열
		int dan = 3;
		int i, j;
		for(i=1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		
		//전체 구구단 - 9행 1열(중첩 for)
		for(i=2; i<10; i++) {
			System.out.println("==" + i +"단==");
			for(j=1; j<10; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
		
		//짝수단 출력
		/*for(i=2; i<10; i++) {
			if(i%2==0) {
				System.out.println("==" + i +"단==");
				for(j=1; j<10; j++) {
					System.out.println(i + "x" + j + "=" + (i*j));
				}
				System.out.println();
			}
		}*/
	}

}
