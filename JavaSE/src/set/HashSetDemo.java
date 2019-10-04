package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,5,6,2,4));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,7,9,5));
		
		//����
		/*set.addAll(set2);
		System.out.println(set);*/
		//����
		/*set.retainAll(set2);
		System.out.println(set);*/
		//��
		set.removeAll(set2);
		System.out.println(set);
		
		//ת������
		System.out.println(Arrays.toString(set.toArray()));
		//set.clear();
		
		//�Ƿ�Ϊ��
		System.out.println(set.isEmpty());
		//�Ƿ����
		System.out.println(set.contains(2));
		//���ϳ���
		System.out.println(set.size());
		
	}

}
