package list;

//实现Comparable接口 自定义比较规则

public class User implements Comparable<Object>{
	
	String name;
	int age;
	
	public User(){}
	
	public User(String name,int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		User u = (User)obj;
		if (this.name.equals(u.name)){
			if(this.age==u.age){
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		User u = (User)o;
		
		if(this.name.compareTo(u.name)>0){
			return 1;
		}else if(this.name.compareTo(u.name)<0){
			return -1;
		}else {
			 if(this.age > u.age){
					return 1;
				}else if(this.age < u.age){
					return -1;
				}else {
					return 0;
				}
		}
	}
	
}
