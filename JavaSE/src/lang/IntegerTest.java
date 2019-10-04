package lang;

public class IntegerTest {
	public static void main(String[] args) {
		
		//Integer t1 = new Integer(100);
		//Integer t2 = new Integer("200");		
		Integer t3 = 100;
		
		double b1 = t3.doubleValue();
		System.out.println(b1);
		
		int t4 = Integer.parseInt("12345");
		System.out.println(t4);
		
		//将数字字符串看做是指定的进制转换成数字(十进制)
		int t5 = Integer.parseInt("12345",6);
		System.out.println(t5);
		//将数字转换成字符串
		String s = Integer.toString(1234567);
		System.out.println(s+1);
		//将数字转换成指定进制的字符串
		String s1 = Integer.toString(1865, 6);
		System.out.println(s1);
		//转换成2进制
		System.out.println(Integer.toBinaryString(-255));
		
		System.out.println(Integer.toString(-255, 2));
		
		String ss = 1234567+"";
		System.out.println(ss+1);
		
		
	}
}
