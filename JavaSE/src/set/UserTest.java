package set;

import java.util.HashSet;

import list.User;

public class UserTest {
	
	public static void main(String[] args) {
		
		//集合不可重复，重写equals方法，name和age都相等才相等
		
		HashSet<User> set = new HashSet<User>();
		User u1 = new  User("张三",18);
		User u2 = new  User("张三",20);
		User u3 = new  User("张三",20);
		User u4 = new  User("张三",18);
		User u5 = new  User("李四",18);
		System.out.println(set.add(u1));
		System.out.println(set.add(u2));
		System.out.println(set.add(u3));
		System.out.println(set.add(u4));
		System.out.println(set.add(u5));
		for(User u : set){
			System.out.println(u);
		}
	}

}
