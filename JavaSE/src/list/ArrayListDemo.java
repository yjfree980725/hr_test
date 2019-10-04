package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {
	

	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(1,"nihao",'a'));
		
		for(Object o:list){
			System.out.print(o+" ");
		}
		
		System.out.println("\n");
		
		Iterator<Object> it = list.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.print(o+" ");
		}
	}
}
