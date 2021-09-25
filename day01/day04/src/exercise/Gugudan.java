package exercise;

public class Gugudan {

	public static void main(String[] args) {
		//전체 구구단
		int i, j;
		for(i=2; i<10; i++) {
			System.out.println("==" + i +"단==");
			for(j=1; j<10; j++) {
				if(i < j)
					break;
				System.out.println(i + "x" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
