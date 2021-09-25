package innerclass;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() { //지역 내부 클래스
		
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				System.out.println(outNum + " : 외부 클래스의 인스턴스 변수");
				System.out.println(sNum + " : 외부 클래스의 정적 변수");
				System.out.println(localNum + " : 내부 클래스의 맴버 변수");
			}
			
		}
		MyRunnable myRun = new MyRunnable();
		return myRun;
	}

}
