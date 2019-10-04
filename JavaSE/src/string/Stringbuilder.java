package string;

public class Stringbuilder {
	public static void main(String[] args) {
		// 拼接字符串
		// String s = "";
		/*for (int i = 1; i <= 1000; i++) {
			
			 * s += i; 
			 * System.out.println(s);
			 * System.out.println("数值太大");
			 
		}*/
		
		StringBuilder s = new StringBuilder();
		long t1 = System.currentTimeMillis();
		for (int i = 1; i <= 3000000; i++) {
			/*
			 * s += i; 
			 * System.out.println(s);
			 * System.out.println("数值太大");
			 */
			s = s.append(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println("完毕:" + (t2 - t1) + "ms");

		StringBuffer s1 = new StringBuffer();
		long t3 = System.currentTimeMillis();
		for (int i = 1; i <= 3000000; i++) {
			s1 = s1.append(i);
		}
		long t4 = System.currentTimeMillis();
		System.out.println("完毕:" + (t4 - t3) + "ms");

	}
}
