package arrays;

public class FindMax {

	public static void main(String[] args) {
		// 최대값 찾기
		int[] arr = {3, 7, 1, 5, 8, 4};
		int max = arr[0];  //max값을 0번 인덱스로 초기화
		
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) { //최대값과 비교
				max = arr[i];  //최대값을 변경
			}
		}
		System.out.println("max = " + max);
		
		//최대값의 위치
		int max_idx = 0;  //0번 인덱스로 설정
		for(int i=1; i<arr.length; i++) {
			if(arr[max_idx] < arr[i]) { //최대값과 비교
				max_idx = i;  //max_idx를 변경
			}
		}
		System.out.println("max_idx = " + max_idx);
		
		
		//최소값 찾기
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) { //최소값과 비교
				min = arr[i];  //최소값을 변경
			}
		}
		System.out.println("min = " + min);
		
		//최소값 위치
		int min_idx = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[min_idx] > arr[i]) { //최대값과 비교
				min_idx = i;  //max_idx를 변경
			}
		}
		System.out.println("min_idx = " + min_idx);

	}

}
