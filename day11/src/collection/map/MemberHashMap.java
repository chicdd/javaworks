package collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	//Integer - memberId와 Member를 자료형으로 hashMap 생성
	HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	//회원 출력
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			Integer key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //외부 memberId가 존재한다면
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존자하지 않습니다.");
		return false;
		
	}
}
