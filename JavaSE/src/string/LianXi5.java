package string;

import java.util.Scanner;

public class LianXi5 {
	public static void main(String[] args) {
		int min = 0;
		int max = 100;

		// 取得0~1之间的随机数
		int a = (int) (Math.random() * 100);

		// 创建一个扫描器对象，接收从控制台的输入
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请开始您的表演：");
		while (true) {
			// 开始接收输入
			int b = sc.nextInt();
			if (b < a) {
				System.out.println("太小了，请从" + b + "到" + max + "之间继续猜！");
				min = b;
			} else if (b > a) {
				System.out.println("太大了，请从" + min + "到" + b + "之间继续猜！");
				max = b;
			} else {
				System.out.println("恭喜你猜中了！！");
				break;
			}

		}
	}
}
