package methods;

public class MathEx {

	public static void main(String[] args) {
		// Math 클래스의 내장 메서드 사용
		// 절대값 
		int v1 = Math.abs(-10);
		System.out.println("v1 = " + v1);
		
		// 반올림
		long v2 = Math.round(5.67);
		System.out.println("v2 = " + v2);
		
		// 버림
		double v3 = Math.floor(2.54);
		System.out.println("v3 = " + v3);
		
		// 최대값
		int max = Math.max(10, 30);
		System.out.println("max = " + max);
		
		// 랜덤(무작위 값) , 범위: 0 크거나 같고 1보다 작다.
		double rand = Math.random();
		System.out.println("rand = " + rand);
		
		// 주사위 눈
		int dice = (int)(Math.random()*6) + 1;
		System.out.println(dice);
		
		//주사위 10번 던지기
		for(int i=1; i<11; i++) {
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.println(dice2);
		}
		
		//문자를 랜덤하게 뽑아내기
		String[] word = {"나", "너", "우리"};
		int r = (int)(Math.random()*word.length);
		System.out.println(r);
		System.out.println(word[r]);
		
		
		/*for(String w : word) {
			System.out.println(w);
		}*/
		
		//시간 측정
		long now = System.currentTimeMillis();
		System.out.println(now/1000);
		//시간 - 1970. 1.1 자정이후 ~ 지금(초로 환산)

	}

}
