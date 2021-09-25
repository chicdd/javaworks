package collection.list;

import java.util.ArrayList;

import collection.Member;

//회원 관리 클래스 - 추가, 조회, 삭제
public class MemberArrayList {
	//ArrayList에 Member type 자료형 사용
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 출력
	public void showAllMember() {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); //memberId, MemberName이 포함된 객체
			int dbMemberId = member.getMemberId(); //이미 저장된 맴버Id를 가져옴
			if(dbMemberId == memberId) { //외부에서 입력한 memberId와 같다면
				arrayList.remove(i);
				return true;
			}
			
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

}
