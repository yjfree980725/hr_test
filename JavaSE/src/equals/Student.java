package equals;

public class Student {
	private String name;
	private int age;

	public Student(String s, int t) {
		name = s;
		age = t;
	}

	// ��д��Object���м̳����ķ���
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && age == s.age;
		}
		return false;
	}

}
