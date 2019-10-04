package list;

public class Student implements Comparable<Object>{
	
	int id;

	public Student(){}
	
	public Student(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}

	@Override
	public int compareTo(Object obj) {
		Student s = (Student)obj;
		if(this.id>s.id)
			return 1;
		else if(this.id<s.id)
			return -1;
		else
			return 0;
	}
}
