package equals;

public class EqualsDemo1 {

	public static void main(String[] args) {
		//自动装箱
		Integer a = 99;
		//Integer b =Integer.valueOf(99);
		//自动拆箱
		@SuppressWarnings("unused")
		int c = a;
		//int d = a.intValue();
		
		int a1 = 10;
		int a2 = 10;
		Integer a3 = 10;
		Integer a4 = 10;
		Integer a5 = new Integer(10);
		Integer a6 = new Integer(10);
		
		
		System.out.println(a1==a2);//true
		System.out.println(a3==a4);//true
		System.out.println(a5==a6);//false
		System.out.println(a1==a3);//true
		System.out.println(a1==a5);//true
		System.out.println(a3==a5);//false
		System.out.println("------------------------");
		
		System.out.println(a3.equals(a4));//true
		System.out.println(a5.equals(a6));//true
		System.out.println(a3.equals(a5));//true
		
		int d = 2;
		int e = 2;
		Integer f = new Integer(2);
		Integer g = new Integer(2);
		System.out.println(d==e);//true
		System.out.println(d==f);//true
		System.out.println(f==g);//false
	}

}
