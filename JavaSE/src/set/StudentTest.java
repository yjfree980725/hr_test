package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		
		//TreeSet������Student�����ʵ��Comparable�ӿ�
		TreeSet<Student> set = new TreeSet<Student> 
			(Arrays.asList(new Student("����",88),new Student("����",90),
					new Student("����",75),new Student("����",98)));
		
		//System.out.println(set.first());
		
		System.out.println();
		Iterator<Student> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
