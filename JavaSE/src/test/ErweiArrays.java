package test;

public class ErweiArrays {

	public static void main(String[] args) {
		int [][] a = new int[3][4];
		a[0][0] = 50;
		a[0][1] = 60;
		a[0][2] = 70;
		a[0][3] = 20;
		
		a[1][0] = 51;
		a[1][1] = 52;
		a[1][2] = 53;
		a[1][3] = 54;
		
		a[2][0] = 51;
		a[2][1] = 52;
		a[2][2] = 53;
		a[2][3] = 54;
		
		for(int i=0;i<a.length;i++){
			int sum = 0;
			int avg =0;
			int temp = 0;
			for(int j=0;j<a[i].length;j++){
				
				int t = a[i][j];
				sum = sum+t;
				temp =a[i][1];
				System.out.println("第"+i+"个同学"+"第"+j+"门成绩:"+t);
			}
			avg = sum/4;
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(temp);
		}
	}
}
