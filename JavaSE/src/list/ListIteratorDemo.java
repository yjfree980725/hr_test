package list;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>(
				Arrays.asList(new Student(1), new Student(2), new Student(3), new Student(4)));

		ListIterator<Student> li = list.listIterator();

		System.out.println(li.nextIndex());
		// 没有前一个值，返回-1
		System.out.println(li.previousIndex());

		while (li.hasNext()) {
			Student s = li.next();
			if (s.id == 2) {
				li.add(new Student(6));
			}
			if (s.id == 4) {
				li.set(new Student(5));
				
			}
		}

		System.out.println();

		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("===============");
		//实现接口，定义排序规则
		Collections.sort(list);
		System.out.println();
		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		// 随机排序
		System.out.println("随机排序:");
		Collections.shuffle(list);
		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// 
		System.out.println("逆序排序");
		Collections.reverse(list);
		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// 使用指定元素替换指定列表中的所有元素
		System.out.println();
		Student stu = new Student(10);
		Collections.fill(list, stu);
		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		List<Student> list2 = new ArrayList<Student>(
				Arrays.asList(new Student(10), new Student(11), new Student(12), new Student(13)));
		// 覆盖,替换前一个列表
		System.out.println();
		Collections.copy(list, list2);
		li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

	}
}