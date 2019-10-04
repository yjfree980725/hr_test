package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 有返回值，第一条元素返回null
		System.out.println(map.put(1, "aaa"));
		// 返回被替换元素
		System.out.println(map.put(1, "bbb"));
		map.put(2, "ccc");
		map.put(3, "ccc");

		// 匹配是否包含该键 或 值
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("bbb"));
		// map.remove(2);

		// map.keySet();返回键的集合

		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println("键:" + i + "  Values:" + map.get(i));
		}
		System.out.println();
		
		Set<Map.Entry<Integer, String>> set1 = map.entrySet();
		for (Map.Entry<Integer, String> entry : set1) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
			// System.out.println(entry);
		}
		System.out.println();
		Iterator<Map.Entry<Integer, String>> it1 = set1.iterator();
		while (it1.hasNext()) {
			Map.Entry<Integer, String> entry = it1.next();
			System.out.println(entry);
		}

	}
}
