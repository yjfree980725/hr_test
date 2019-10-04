package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		test7();
	}

	/*
	 * ���a��b����������ֵ�Ľ���
	 */
	private static void test1() {
		// 1
		int x = 2;
		int y = 5;
		// ���������ʱ����temp����ȡxֵ
		int temp = x;
		// ��y��ֵ����x
		x = y;
		// Ȼ�����ʱ����tempֵ����y
		y = temp;
		// 2
		/*
		 * a = a^b; b = a^b; a = a^b;
		 */

		/*
		 * x=5;y=10; x = x + y; //x(15) = x(5) + y(10); y = x - y; //y(5) = x(15) -
		 * y(10); x = x - y; //x(10) = x(15) - y(5)
		 */
		System.out.println(x);
		System.out.println(y);
	}

	/*
	 * ������һ������n�η�
	 */
	private static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		int a = sc.nextInt();
		System.out.println("������һ�����Ķ��ٴη���");
		int b = sc.nextInt();
		int c = a;
		if (b == 1) {
			System.out.println(a);
		} else {
			for (int i = 1; i < b; i++) {
				c = c * a;
			}
			System.out.println(a + "��" + b + "�η���" + c);
		}
		sc.close();
	}

	/*
	 * ��ӡ��1000�������е� "ˮ�ɻ��� "��
	 * ��ν "ˮ�ɻ��� "��ָһ����λ�� 
	 * ���λ���������͵��ڸ������� 
	 * ���磺153��һ�� "ˮ�ɻ���
	 * ��Ϊ153=1�����η���5�����η���3�����η���
	 */
	private static void test3() {
		for (int num = 100; num < 1000; num++) {
			// �ֱ�ȡ��λ ʮλ ��λ
			int a = num % 10;
			int b = num / 10 % 10;
			int c = num / 100;

			if (a * a * a + b * b * b + c * c * c == num) {
				System.out.println(num + "��һ��ˮ�ɻ���");
			}
		}
	}
	
	/*
	 * ��ӡ����
	 */
	private static void test4() {
		int hang = 21;
		int b = hang / 2;
		int a = 1;
		for (int i = 0; i < hang; i++) {
			// �ո�
			for (int k = 0; k < b; k++) {
				System.out.print(" ");
			}
			// *
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			// ����
			System.out.println();
			if (i < hang / 2) {
				a += 2;
				b--;
			} else {
				a -= 2;
				b++;
			}
		}
	}
	
	/*
	 * ��ӡֱ��������
	 */
	private static void test5() {
		 // ���ѭ���������� 
		 for (int i = 1; i<5;i++ ) {
		 // �ڲ�ѭ������ÿ�е�*����
			 for (int j = 1; j<i+1;j++ ) {
				 System.out.print("*"); 
			 }
		 // ÿ��ӡ��һ�к���л���
			 System.out.println(); 
	     }
	}
	
	/*
	 * ��ӡ����������
	 */
	private static void test6() {
		int h2 = 5; // ���������εĸ߶�
		for (int b1 = 0; b1 < h2; b1++) {
			for (int b3 = h2; b3 > b1; b3--) {
				System.out.print(" ");
			}
			for (int b2 = 0; b2 <= 2 * b1 - 1; b2++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	/*
	 * 1989��5��6����1989��ĵڼ���
	 */
	private static void test7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ݣ�");
		
		int year = sc.nextInt();
		System.out.print("�������·ݣ�");
		
		int month = sc.nextInt();
		System.out.print("�������գ�");
		
		int day = sc.nextInt();
		
		int count = 0;
		
		int days = 0;
		
		if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			for (int i = 1; i < month; i++) {
				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					days = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					days = 30;
					break;
				case 2: {
					if ((year % 4 == 0 && year % 1 != 0) || (year % 400 == 0)) {
						days = 29;
					} else {
						days = 28;
					}
					break;
				}
				}
				count = count + days;
			}
			count = count + day;
			System.out.println(year + "��" + month + "��" + day + "����" + year + "��ĵ�" + count + "��");
			sc.close();
		} else
			System.out.println("�����������");
	}
	

}
