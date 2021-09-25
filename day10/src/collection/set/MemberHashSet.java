package collection.set;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//회원 출력
	public void showAllMember() {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) { //자료가 있으면
			Member member = ir.next(); //자료를 가져와서
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {  //반복하면서 자료가 있으면
			Member member = ir.next(); //자료를 가져오고
			int dbId = member.getMemberId();  //기존의 저장된 memberId를 기억
			if(dbId == memberId) {  //요청하는 삭제 Id와 비교
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
}
