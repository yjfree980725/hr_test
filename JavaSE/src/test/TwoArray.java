package test;

public class TwoArray {
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		// ÿλͬѧ���ܳɼ�
		int[] b = new int[a.length];
		// ÿλͬѧ��ƽ���ɼ�
		float[] c = new float[b.length];
		// ÿ�ſε��ܳɼ�
		float[] d = new float[a[0].length];

		a[0][0] = 90;
		a[0][1] = 80;
		a[0][2] = 70;
		a[0][3] = 60;

		a[1][0] = 91;
		a[1][1] = 81;
		a[1][2] = 71;
		a[1][3] = 61;

		a[2][0] = 92;
		a[2][1] = 82;
		a[2][2] = 72;
		a[2][3] = 62;

		for (int i = 0; i < a.length; i++) {
			// ���һλͬѧ�ĸ��Ƴɼ�
			for (int j = 0; j < a[i].length; j++) {
				int t = a[i][j];
				b[i] = b[i] + t;
				d[j] += t;
				System.out.print("��" + i + "��ͬѧ��" + j + "�ſ�:" + t + " ");
			}
			float sum = b[i];
			c[i] = sum / a[i].length;
			System.out.println();

		}

		// ����ܳɼ�
		for (int i = 0; i < b.length; i++) {
			System.out.println("��" + i + "λͬѧ���ܳɼ�:" + b[i] + ",ƽ����:" + c[i]);
		}

		for (int i = 0; i < d.length; i++) {
			System.out.println("��" + i + "�ſε��ܳɼ�:" + d[i]);
		}

		// ��߷�
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}

			}
		}

		// ��ͷ�

	}
}