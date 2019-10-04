package list;

import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>(Arrays.asList("abc","def","ghi"));
		
		list.addFirst("list");
		list.removeLast();
		list.addLast("last");
		
		System.out.println(list.getFirst());
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
