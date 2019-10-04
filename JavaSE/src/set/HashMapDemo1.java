package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Random rand = new Random();
		
		for(int i=0;i<10000;i++){
			int r = rand.nextInt(10);
			Integer in = map.get(r);
			map.put(r, in == null?1:++in);
		}
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			Integer  a = it.next();
			System.out.println("¼ü£º"+a+"   Öµ£º"+map.get(a));
		}
	}

}
