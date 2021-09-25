package inherit;

public class SuperSonicAirPlane extends AirPlane{
	//초음속 비행기의 모드 - 일반모드, 초음속 모드
	static final int NORMAL = 1;   //상수 표기
	static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL;
	
	@Override   //애너테이션 표시 -> 메서드 재정의(오버라이드)
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {//부모 메서드 상속할때도 super로 접근
			super.fly();  //일반 비행합니다.
			//System.out.println("일반 비행합니다.");
		}	
	}
}
