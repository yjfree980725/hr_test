package equals;

public class Student {
	private String name;
	private int age;

	public Student(String s, int t) {
		name = s;
		age = t;
	}

	// 重写从Object类中继承来的方法
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
