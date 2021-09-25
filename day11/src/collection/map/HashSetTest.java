package collection.map;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		//HashMap Ŭ������ map ��ü ����
		Map<String, Integer> map = new HashMap<>();
		
		//�ڷ� �߰�
		map.put("���̹�", 400000);
		map.put("īī��", 150000);
		map.put("��������Ʈ", 600000);
		map.put("���̹�", 450000);
		
		//�� ��ü��
		System.out.println("�� ��ü�� : " + map.size());
		
		//��ü ���
		System.out.println(map);
		
		//Ư���� 1�� �˻� - Key�� ���ؼ� value�� ������
		System.out.println("īī�� : " + map.get("īī��"));
		System.out.println("===============================");
		
		//��ü ���
		/*Set<String> keySet = map.keySet();
		Iterator<String> ir = keySet.iterator();*/
		
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		
		
	}

}