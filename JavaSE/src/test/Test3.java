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
	 * 完成a和b两个变量数值的交换
	 */
	private static void test1() {
		// 1
		int x = 2;
		int y = 5;
		// 定义第三临时变量temp并提取x值
		int temp = x;
		// 把y的值赋给x
		x = y;
		// 然后把临时变量temp值赋给y
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
	 * 求任意一个数的n次方
	 */
	private static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int a = sc.nextInt();
		System.out.println("请输入一个数的多少次方：");
		int b = sc.nextInt();
		int c = a;
		if (b == 1) {
			System.out.println(a);
		} else {
			for (int i = 1; i < b; i++) {
				c = c * a;
			}
			System.out.println(a + "的" + b + "次方是" + c);
		}
		sc.close();
	}

	/*
	 * 打印出1000以内所有的 "水仙花数 "，
	 * 所谓 "水仙花数 "是指一个三位数 
	 * 其各位数字立方和等于该数本身。 
	 * 例如：153是一个 "水仙花数
	 * 因为153=1的三次方＋5的三次方＋3的三次方。
	 */
	private static void test3() {
		for (int num = 100; num < 1000; num++) {
			// 分别取个位 十位 百位
			int a = num % 10;
			int b = num / 10 % 10;
			int c = num / 100;

			if (a * a * a + b * b * b + c * c * c == num) {
				System.out.println(num + "是一个水仙花数");
			}
		}
	}
	
	/*
	 * 打印菱形
	 */
	private static void test4() {
		int hang = 21;
		int b = hang / 2;
		int a = 1;
		for (int i = 0; i < hang; i++) {
			// 空格
			for (int k = 0; k < b; k++) {
				System.out.print(" ");
			}
			// *
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			// 换行
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
	 * 打印直角三角形
	 */
	private static void test5() {
		 // 外层循环控制行数 
		 for (int i = 1; i<5;i++ ) {
		 // 内层循环控制每行的*号数
			 for (int j = 1; j<i+1;j++ ) {
				 System.out.print("*"); 
			 }
		 // 每打印完一行后进行换行
			 System.out.println(); 
	     }
	}
	
	/*
	 * 打印等腰三角形
	 */
	private static void test6() {
		int h2 = 5; // 设置三角形的高度
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
	 * 1989年5月6日是1989年的第几天
	 */
	private static void test7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入年份：");
		
		int year = sc.nextInt();
		System.out.print("请输入月份：");
		
		int month = sc.nextInt();
		System.out.print("请输入日：");
		
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
			System.out.println(year + "年" + month + "月" + day + "日是" + year + "年的第" + count + "天");
			sc.close();
		} else
			System.out.println("数据输入错误！");
	}
	

}
