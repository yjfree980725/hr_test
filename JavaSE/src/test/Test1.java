package test;

public class Test1 {

	public static void main(String[] args) {
		test1(123456);
		test2(123456);
		test3(1233211);
		test4();
		test5();
	}

	/*
	 * 判断一个数是几位数
	 */
	public static void test1(int num) {
		int temp = num;
		// 统计循环次数，循环几次就是几位数
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println(num + "是一个" + count + "位数");
	}

	/*
	 * 倒叙输出一个多位数
	 */
	public static void test2(int num) {
		int temp = num;
		int a = 0;
		int b = 0;
		while (temp > 0) {
			a = temp % 10;
			temp = temp / 10;
			b = b * 10 + a;
		}
		System.out.println(num + "倒序之后的数字是：" + b);
	}

	/*
	 * 判断一个数是否为回文数
	 */
	public static void test3(int num) {
		int temp = num;
		int a = 0;
		int b = 0;
		while (temp > 0) {
			a = temp % 10;
			temp /= 10;
			b = b * 10 + a;
		}
		if (num == b) {
			System.out.println(num + "是一个回文数");
		} else {
			System.out.println(num + "不是一个回文数");
		}
	}

	/*
	 * 斐波拉契数列
	 */
	public static void test4() {
		int a = 1;
		int b = 1;
		for (int i = 3; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println("第" + i + "个月的兔子数:" + c);
		}
	}

	/*
	 * 猴子吃桃,第10天只剩一个桃子，一天吃一半加一个
	 */
	public static void test5() {
		int a = 1;
		for (int i = 9; i >= 1; i--) {
			a = (a + 1) * 2;
			System.out.println("第" + i + "天剩余桃子数:" + a);
		}
	}

}