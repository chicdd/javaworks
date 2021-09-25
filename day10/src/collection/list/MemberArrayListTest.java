package collection.list;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList mArrayList = new MemberArrayList();
		
		//Member °´Ã¼ »ı¼º
		Member m1 = new Member(101, "ÄáÁã");
		Member m2 = new Member(102, "ÆÏÁã");
		Member m3 = new Member(103, "ÈïºÎ");
		Member m4 = new Member(104, "³îºÎ");
		Member m5 = new Member(101, "ÄáÁã");
		
		//È¸¿ø Ãß°¡
		mArrayList.addMember(m1);
		mArrayList.addMember(m2);
		mArrayList.addMember(m3);
		mArrayList.addMember(m4);
		mArrayList.addMember(m5);
		
		//È¸¿ø Á¶È¸
		mArrayList.showAllMember();
		System.out.println("===========================");
		
		//È¸¿ø »èÁ¦
		mArrayList.removeMember(102);
		mArrayList.removeMember(105);
		
		//È¸¿ø Á¶È¸
		mArrayList.showAllMember();
	}

}
