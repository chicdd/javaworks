package arrays;

public class CopyArray {

	public static void main(String[] args) {
		// 배열의 복사
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = new int[4];
		
		// arr1의 배열 요소를 arr2로 저장
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			//arr2[0] = 1
		}
		
		//arr2를 출력
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 문자형 배열 역순 복사
		char[] chArr1 = {'N', 'E', 'T'};
		char[] chArr2 = new char[3];
		
		for(int i=0; i<chArr1.length; i++) {
			chArr2[2-i] = chArr1[i];
			//chArr2[2] = chArr1[0]
			//chArr2[1] = chArr1[1]
			//chArr2[0] = chArr1[2]
		}
		
		for(int i=0; i<chArr2.length; i++) {
			System.out.print(chArr2[i] + " ");
		}

	}

}
