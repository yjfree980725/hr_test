package string;

public class StringTest {
	public static void main(String[] args) {
		String str = " YuanJian.com ";
		// 字符串长度
		int a = str.length();
		System.out.println(a);
		// 获取字符下标对应的字符
		char at = str.charAt(1);
		System.out.println(at);
		// 查找字符第一次出现的下标
		int b = str.indexOf("an");
		System.out.println(b);
		// 查找字符最后一次出现的下标
		int c = str.lastIndexOf("an");
		System.out.println(c);
		// 截取子字符串，先从开始截
		int d = str.indexOf("n");
		String str1 = str.substring(d + 1);
		System.out.println(str1 + "<><>");// Jian.com
		
		int f = str.indexOf(".");
		String str2 = str.substring(0, f);
		System.out.println(str2);
		// 去除前后空格
		String str3 = str.trim();
		System.out.println(str3);
		// 转换大小写 小写 大写
		String str4 = str.toLowerCase();
		System.out.println(str4);
		String str5 = str.toUpperCase();
		System.out.println(str5);
		// 字符串转换成整形
		//String m = "10";
		String s = "123";
		//int n = Integer.parseInt(m);
		Integer l = Integer.valueOf(s);
		//int s2 = l;
		System.out.println(l + 1);
		// 整形转换成字符串
		//int i = 10;
		//String c1 = Integer.toString(i);// 一
		//String d1 = String.valueOf(i); // 二
		//String f1 = i + ""; // 最简单
		System.out.println(f + 1);

	}
}
