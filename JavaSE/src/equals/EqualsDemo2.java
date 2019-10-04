package equals;

public class EqualsDemo2 {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("ABC");
		String s4 = new String("ABC");
		
		Student s5 = new Student("ABC", 20);
		Student s6 = new Student("ABC", 20);
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		String a="hello2";
		final String b = "hello";
		String c = "hello";
		String d = b+2;
		String e = c+2;
		System.out.println("a==d:"+ (a==d));//true
		System.out.println("a==e:"+ (a==e));//false
		
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);// false
		System.out.println(s1 == s3);// fasle

		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));

	}

}
