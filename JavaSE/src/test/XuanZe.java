package test;

import java.util.Arrays;

public class XuanZe {
	// —°‘Ò≈≈–Ú
	public static void main(String[] args) {

		int a[] = { 5, 7, 2, 3, 6, 4, 9, 1, 8 };

		for (int i = 0; i < a.length; i++) {
			int temp = 0;
			for (int j = a.length - 1; j > i; j--) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(a));
	}
}
