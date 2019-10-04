package string;

public class Lianxi3 {

	public static void main(String[] args) {

		// 创建一个空的StringBuilder

		StringBuilder str = new StringBuilder();// 追加字符串

		str.append("jaewkjldfxmopzdmI");// 从后往前每隔三位插入逗号

		for (int i = str.length() - 3; i > 0; i = i - 3) {
			// 指定位置插入逗号
			str.insert(i, ',');
		}
		// 将StringBuilder对象转换为String对象并输出
		System.out.println(str.toString());
		
		test();
	}

	public static void test() {
		// 定义一个字符串
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
		// 出现次数
		int num = 0;

		// 循环遍历每个字符，判断是否是字符 a ，如果是，累加次数
		for (int i = 0; i < s.length(); i++) {
			// 获取每个字符，判断是否是字符a
			if (s.charAt(i) == 'a') {
				// 累加统计次数
				num++;
			}
		}
		System.out.println("字符a出现的次数：" + num);
	}
}
