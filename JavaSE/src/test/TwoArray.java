package test;

public class TwoArray {
	public static void main(String[] args) {
		int[][] a = new int[3][4];
		// 每位同学的总成绩
		int[] b = new int[a.length];
		// 每位同学的平均成绩
		float[] c = new float[b.length];
		// 每门课的总成绩
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
			// 输出一位同学的各科成绩
			for (int j = 0; j < a[i].length; j++) {
				int t = a[i][j];
				b[i] = b[i] + t;
				d[j] += t;
				System.out.print("第" + i + "个同学第" + j + "门课:" + t + " ");
			}
			float sum = b[i];
			c[i] = sum / a[i].length;
			System.out.println();

		}

		// 输出总成绩
		for (int i = 0; i < b.length; i++) {
			System.out.println("第" + i + "位同学的总成绩:" + b[i] + ",平均分:" + c[i]);
		}

		for (int i = 0; i < d.length; i++) {
			System.out.println("第" + i + "门课的总成绩:" + d[i]);
		}

		// 最高分
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}

			}
		}

		// 最低分

	}
}