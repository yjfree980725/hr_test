package set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {

	public static void main(String[] args) {
		
		//TreeSet集合中Student类必须实现Comparable接口
		TreeSet<Student> set = new TreeSet<Student> 
			(Arrays.asList(new Student("张三",88),new Student("李四",90),
					new Student("王五",75),new Student("赵六",98)));
		
		//System.out.println(set.first());
		
		System.out.println();
		Iterator<Student> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
