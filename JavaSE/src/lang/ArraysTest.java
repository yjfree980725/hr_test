package lang;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest {
	public static void main(String[] args) {
		int[] a = { 5, 3, 6, 1, 2, 7, 4 };

		// 对数组升序排序
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// //使用二分搜索法检索数据出现的位置
		 int index = Arrays.binarySearch(a, 6);
		 System.out.println(index);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		//逆序排序集合
		Collections.reverse(list);

		Object[] arr2 = list.toArray();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}

		System.out.println();
	
		//{1,2,3,4,5,6,7}
		//拷贝一份新数组
		int[] b = Arrays.copyOfRange(a, 1,a.length);
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		System.out.println(Arrays.toString(b));
		
	}
}
