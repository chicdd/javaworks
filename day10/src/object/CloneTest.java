package object;

public class CloneTest {

	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40};
		int[] arr2 = new int[4];
		
		//복사
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		//arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println();
		
		//clone()으로 복사
		int[] arr3 = arr2.clone();
		
		//arr3 출력
		for(int arr : arr3) {
			System.out.print(arr + " ");
			
		}
	}

}
