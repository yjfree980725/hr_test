package test;

public class Test2 {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

	/*
	 * ���100���ڵ�����
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
				System.out.println(i + "������");
			}
		}

	}

	/*
	 * ���100���ڵ�����������
	 */
	public static void test2() {
		int count = 0;
		int x = 0;
		for (int i = 2; i <= 100; i++) {// ����2��100
			x = 0; // ����������Ϊ0�����粻����0��
			// ������һ��ѭ�����������ۼӣ��ò�������Ҫ�Ľ��
			for (int j = 1; j < i; j++) {// �ñ�����������1��������
				if (i % j == 0) {// ȡ��
					x++;// ���Ϊ0����1
				}
			}
			if (x == 1) { // ���������Ϊ1��֤������������Ϊ������û�ӵȺţ����Բ��������������������
				// �ӵȺŵĻ���x==2
				count++;
				System.out.println(i);// �������
			}
		}
		System.out.println(count + "��");// ��������ĸ���
	}

	/*
	 * 0-6 ��Ϊ6�ļӷ�
	 */
	public static void test3() {
		for (int i = 0, j = 6; i <= 6; i++, j--) {
			System.out.println(j + "+" + i + "=" + (i + j));
		}
	}

	/*
	 * ���ŵ�����
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
	 * ������a�������һ��������
	 */
	public static void test5() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// ����һ����aһ�����ȵ�����
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[b.length - (i + 1)] = a[i];
		}
		// ���b����
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
