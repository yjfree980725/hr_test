package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//以插入顺序保存元素
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>(
				Arrays.asList(2,4,5,6,7,8));
		
		for(Integer i : lhs){
			System.out.print(i+" ");
		}
		System.out.println();
		
		//自动排序
		TreeSet<Integer> tree = new TreeSet<Integer>(Arrays.asList(3,5,4,7,6));
		for(Integer i : tree){
			System.out.print(i+" ");
		}
		System.out.println();
		
		TreeSet<String> stree = new TreeSet<String>(Arrays.asList("a","c","d","b"));
		Iterator<String> sit = stree.iterator();
		while(sit.hasNext()){
			System.out.print(sit.next()+"\t");
		}
		/*for(int i=0;i<stree.size();i++){
		System.out.println(stree.pollFirst());
		}*/
		System.out.println();
		
		//查询
		System.out.println(tree.first());
		System.out.println(tree.last());
		//移除
		System.out.println(tree.pollFirst());
		System.out.println(tree.pollLast());
		
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
	}

}
