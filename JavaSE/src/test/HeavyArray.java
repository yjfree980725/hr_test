package test;

public class HeavyArray {
	/**
	 * 去掉数组的重复项，组成一个新数组
	 */
	public static void main(String[] args) {
		int[] a = { 1, 3, 7, 5, 3, 2, 1, 6, 0, 9, 4, 8, 6, 7, 3 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		// 统计重复的个数
		int count = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			}
		}
		System.out.println(count);
		int[] b = new int[a.length - count];
		b[0] = a[0];
		int j = 1;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				b[j++] = a[i + 1];
			}
		}

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}
}