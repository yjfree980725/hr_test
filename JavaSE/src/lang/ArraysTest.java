package lang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest {
	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 1, 2, 7, 4 };

		// ��������������
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// //ʹ�ö����������������ݳ��ֵ�λ��
		 int index = Arrays.binarySearch(a, 6);
		 System.out.println(index);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		//�������򼯺�
		Collections.reverse(list);

		Object[] arr2 = list.toArray();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println();
	
		//{1,2,3,4,5,6,7}
		//����һ��������
		int[] b = Arrays.copyOfRange(a, 1,a.length);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		System.out.println(Arrays.toString(b));
		
	}
}
