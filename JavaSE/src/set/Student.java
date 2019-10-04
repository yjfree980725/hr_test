package set;


public class Student implements Comparable<Object>{
	String name;
	int english;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public Student(){}
	
	public Student(String name, int english) {
		super();
		this.name = name;
		this.english = english;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", english=" + english + "]";
	}

	//°´Ó¢Óï³É¼¨½µĞòÅÅĞò
	@Override
	public int compareTo(Object a) {
		Student stu = (Student)a;
		if(this.english>stu.english){
			return -1;
		}else if(this.english<stu.english){
			return 1;
		}else{
			return 0;
		}
	}

	

}
