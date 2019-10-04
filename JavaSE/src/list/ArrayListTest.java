package list;

import java.util.ArrayList;

/**
 * ArrayList测试类
 */
public class ArrayListTest {

	public static void main(String[] args) {
		//创建一个ArrayList对象
		//如果用的是泛型类，在创建对象的时候要明确泛型的具体类型
		//如果不确定，就默认为Object类型
		ArrayList<String> list = new ArrayList<String>();
		//添加数据
		list.add("李四");//0
		list.add("张三");
		list.add("李四");
		list.add("王五");

		//插入数据
		list.add(1, "插队的");
		System.out.println(list);
		
		//移除
		String obj2 = list.remove(2);
		System.out.println("移除的:"+obj2);
		System.out.println(list);
		
		//如果有重复元素，只移除下标最小的
		list.remove("李四");
		System.out.println(list);
		
		list.set(2, "替换的");
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
