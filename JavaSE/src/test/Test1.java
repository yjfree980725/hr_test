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
	 * �ж�һ�����Ǽ�λ��
	 */
	public static void test1(int num) {
		int temp = num;
		// ͳ��ѭ��������ѭ�����ξ��Ǽ�λ��
		int count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		System.out.println(num + "��һ��" + count + "λ��");
	}

	/*
	 * �������һ����λ��
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
		System.out.println(num + "����֮��������ǣ�" + b);
	}

	/*
	 * �ж�һ�����Ƿ�Ϊ������
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
			System.out.println(num + "��һ��������");
		} else {
			System.out.println(num + "����һ��������");
		}
	}

	/*
	 * 쳲���������
	 */
	public static void test4() {
		int a = 1;
		int b = 1;
		for (int i = 3; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println("��" + i + "���µ�������:" + c);
		}
	}

	/*
	 * ���ӳ���,��10��ֻʣһ�����ӣ�һ���һ���һ��
	 */
	public static void test5() {
		int a = 1;
		for (int i = 9; i >= 1; i--) {
			a = (a + 1) * 2;
			System.out.println("��" + i + "��ʣ��������:" + a);
		}
	}

}