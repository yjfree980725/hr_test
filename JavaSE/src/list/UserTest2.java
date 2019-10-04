package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

//匿名内部类 new Comparator接口 排序

public class UserTest2 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>(Arrays.asList(new User("Lucy",19),
				new User("Jack",19),new User("Jim",19),new User("James",19),new User("Herry",19),
				new User("Luccy",19),new User("James",18),new User("Herry",20)));
		
		ListIterator<User> li = list.listIterator();
		
		while(li.hasNext()){
			User u = li.next();
			System.out.println("排序前："+u);
		}
		
		System.out.println();
		//排序
		/*Collections.sort(list);*/
		Collections.sort(list, new Comparator<User>(){

			@Override
			public int compare(User u1, User u2) {
				if(u1.name.compareTo(u2.name)>0){
					return 1;
				}else if(u1.name.compareTo(u2.name)<0){
					return -1;
				}else
					
				 if(u1.age>u2.age){
					return 1;
				}else if(u1.age<u2.age){
					return -1;
				}else {
					return 0;
				}
			}
			
		});
		
		li = list.listIterator();
		while(li.hasNext()){
			User u = li.next();
			System.out.println("排序后："+u);
		}

	}

}
