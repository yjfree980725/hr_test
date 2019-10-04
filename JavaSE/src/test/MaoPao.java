package test;

import java.util.Arrays;

public class MaoPao {

	public static void main(String[] args) {
		Maopao();
	}

	static void Maopao() {
		int a[] = { 5, 7, 2, 3, 6, 4, 9, 1, 8 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				//System.out.println(Arrays.toString(a));
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	/*// 冒泡排序
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] > a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		//System.out.println(Arrays.toString(a));
	}
	// 输出a数组
	System.out.println(Arrays.toString(a));*/
	/*for (int i = 0; i < a.length; i++) {
		for (int j = a.length - 1; j > 0; j--) {
			if (a[j] < a[j - 1]) {
				int temp = a[j];
				a[j] = a[j - 1];
				a[j - 1] = temp;
			}
		}
	}
	// 输出b数组
	for (int k = 0; k < a.length; k++) {
		System.out.print(a[k] + " ");
	}
	System.out.println();*/
}
