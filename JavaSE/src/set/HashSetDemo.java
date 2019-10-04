package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,5,6,2,4));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3,4,7,9,5));
		
		//并集
		/*set.addAll(set2);
		System.out.println(set);*/
		//交集
		/*set.retainAll(set2);
		System.out.println(set);*/
		//差
		set.removeAll(set2);
		System.out.println(set);
		
		//转成数组
		System.out.println(Arrays.toString(set.toArray()));
		//set.clear();
		
		//是否为空
		System.out.println(set.isEmpty());
		//是否包含
		System.out.println(set.contains(2));
		//集合长度
		System.out.println(set.size());
		
	}

}
