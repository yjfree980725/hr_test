package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//ʵ��Comparable�ӿ� �Զ���ȽϹ���

public class UserTest1 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>(Arrays.asList(new User("Lucy",19),
				new User("Jack",19),new User("Jim",19),new User("James",19),new User("Herry",19),
				new User("Luccy",19),new User("James",18),new User("Herry",20)));
		
		ListIterator<User> li = list.listIterator();
		
		while(li.hasNext()){
			User u = li.next();
			System.out.println("����ǰ��"+u);
		}
		
		System.out.println();
		//����
		Collections.sort(list);
		
		li = list.listIterator();
		while(li.hasNext()){
			User u = li.next();
			System.out.println("�����"+u);
		}

	}

}
