package switchcase;

public class SwitchEx {

	public static void main(String[] args) {
		// 조건문: switch ~ case 문 사용하기
		// 비교범위가 있는 경우는 if문을 사용하는 것이 좋다.
		// 순위에 따른 메달 색상 구분하기
		int rank = 3;
		String medalColor = "";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			break;
		}
		System.out.println("메달 색상은 " + medalColor + "입니다.");
		

		/*
		if(rank==1) {
			medalColor = "Gold";
		}else if(rank==2) {
			medalColor = "Silver";
		}else if(rank==3) {
			medalColor = "Bronze";
		}else {
			medalColor = "None";
			System.out.println("메달이 없습니다.");
		}
		System.out.println("메달 색상은 " + medalColor + "입니다.");
		*/
		
	}
}
