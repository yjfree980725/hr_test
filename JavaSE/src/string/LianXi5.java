package string;

import java.util.Scanner;

public class LianXi5 {
	public static void main(String[] args) {
		int min = 0;
		int max = 100;

		// ȡ��0~1֮��������
		int a = (int) (Math.random() * 100);

		// ����һ��ɨ�������󣬽��մӿ���̨������
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�뿪ʼ���ı��ݣ�");
		while (true) {
			// ��ʼ��������
			int b = sc.nextInt();
			if (b < a) {
				System.out.println("̫С�ˣ����" + b + "��" + max + "֮������£�");
				min = b;
			} else if (b > a) {
				System.out.println("̫���ˣ����" + min + "��" + b + "֮������£�");
				max = b;
			} else {
				System.out.println("��ϲ������ˣ���");
				break;
			}

		}
	}
}
