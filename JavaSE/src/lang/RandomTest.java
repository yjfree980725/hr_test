package lang;

import java.util.Arrays;
import java.util.Random;
//�������1-50 100-150���������

public class RandomTest {
	public static void main(String[] args) {

		// String[] arr = {"��ɳ","����","��̶"};
		int[] a = new int[100];
		int i = 0;
		for (i = 0; i < 50; i++) {
			a[i] = i;
		}
		for (int j = 100; j < 150; j++) {
			a[i++] = j;
		}

		System.out.println(Arrays.toString(a));
		System.out.println("========================");
		
		Random rd = new Random();
		for (int j = 0; j < 10; j++) {
			int t = rd.nextInt(a.length);
			System.out.println(a[t]);
		}
		
		System.out.println("---------------");
			
		for(int k=0;k<10;k++){
			System.out.println(rd.nextInt(10)+1);
		}

		// int count = 0;
		// while (count < 10) {
		// // ��0~100֮�����һ������
		// int t = rd.nextInt(150);
		// if (t > 50 && t < 100) {
		// t /= 2;
		// }
		// System.out.println(t);
		// count++;
		// }
	}
}
