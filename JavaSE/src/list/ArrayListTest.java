package list;

import java.util.ArrayList;

/**
 * ArrayList������
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//����һ��ArrayList����
		//����õ��Ƿ����࣬�ڴ��������ʱ��Ҫ��ȷ���͵ľ�������
		//�����ȷ������Ĭ��ΪObject����
		ArrayList<String> list = new ArrayList<String>();
		//�������
		list.add("����");//0
		list.add("����");
		list.add("����");
		list.add("����");

		//��������
		list.add(1, "��ӵ�");
		System.out.println(list);
		
		//�Ƴ�
		String obj2 = list.remove(2);
		System.out.println("�Ƴ���:"+obj2);
		System.out.println(list);
		
		//������ظ�Ԫ�أ�ֻ�Ƴ��±���С��
		list.remove("����");
		System.out.println(list);
		
		list.set(2, "�滻��");
		System.out.println(list);
		
		String obj = list.get(2);
		System.out.println(obj);
		
		int len = list.size();
		System.out.println(len);
		
		for(int i=0;i<list.size();i++){
			String obj1 = list.get(i);
			System.out.print(obj1+" ");
		}
	}
}
