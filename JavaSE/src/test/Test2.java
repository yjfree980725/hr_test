package test;

public class Test2 {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	/*
	 * 输出100以内的质数
	 */
	public static void test1() {

		for (int i = 2; i <= 100; i++) {
			boolean flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(i + "是质数");
			}
		}

	}

	/*
	 * 输出100以内的质数及个数
	 */
	public static void test2() {
		int count = 0;
		int x = 0;
		for (int i = 2; i <= 100; i++) {// 遍历2到100
			x = 0; // 计数器重置为0，假如不重置0，
			// 是在上一个循环基础上做累加，得不到我们要的结果
			for (int j = 1; j < i; j++) {// 用遍历的数除以1到他本身
				if (i % j == 0) {// 取余
					x++;// 结果为0，加1
				}
			}
			if (x == 1) { // 假如计数器为1，证明是质数，因为上面我没加等号，所以不包括它本身这个质数，
				// 加等号的话，x==2
				count++;
				System.out.println(i);// 输出质数
			}
		}
		System.out.println(count + "个");// 输出质数的个数
	}

	/*
	 * 0-6 和为6的加法
	 */
	public static void test3() {
		for (int i = 0, j = 6; i <= 6; i++, j--) {
			System.out.println(j + "+" + i + "=" + (i + j));
		}
	}

	/*
	 * 符号倒三角
	 */
	public static void test4() {
		int hang = 36;
		int kong = 0;
		int zifu = hang * 2 - 1;
		for (int i = 0; i < hang; i++) {
			for (int j = 0; j < kong; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < zifu; k++) {
				int t = hang - i;
				if (t >= 10) {
					char c = (char) (t + 90);
					System.out.print(c);
				} else {
					System.out.print(hang - i);
				}

			}
			System.out.println();
			kong++;
			zifu -= 2;
		}
	}
	
	/*
	 * 将数组a倒叙组成一个新数组
	 */
	public static void test5() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// 定义一个和a一样长度的数组
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[b.length - (i + 1)] = a[i];
		}
		// 输出b数组
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
