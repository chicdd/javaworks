package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// 배열의 범위를 벗어난 경우 예외 처리
		int[] arr = new int[3];
		
		try {  //예외가 발생할 수 있는 영역에 try{} 설정
			//값 저장
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			arr[3] = 40;
			
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//예외 처리 부분에 catch() 설정
			//System.out.println(e);
			System.out.println("예외 처리 부분");
		}
	}
}
