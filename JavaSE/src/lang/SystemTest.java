package lang;

import java.util.Arrays;
public class SystemTest {
	public static void main(String[] args) {
		/*
		 * System.out.println("标准输出");
		 * System.err.println("标准错误输出");
		 * //扫描器,扫描从控制台的输入
		 * Scanner sc = new Scanner(System.in);  
		 * String s = sc.next(); 
		 */
		//拷贝数组的方法 
		//参数1：原数组
		//参数2：原数组的起始位置
		//参数3：目标数组
		//参数4：目标数组的起始位置
		//参数5：要拷贝的个数
			int[] a = { 1, 3, 5, 7, 9 }; 
			int[] b = new int[a.length];
			//完全复制
		   System.arraycopy(a, 0, b, 0, a.length);
		// System.arraycopy(a, 1, b, 0, a.length-1);
		   	for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" "); 
			}
		System.out.println();
		//System.out.println(Arrays.toString(a));
		//拷贝数组
		int[] c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		//拷贝数组从哪到哪
		int[] d = Arrays.copyOfRange(a, 0, a.length-1);
		System.out.println(Arrays.toString(d));
		
		// System.exit(0); 退出 程序不执行
		long t1 = System.nanoTime();
		long t2 = System.nanoTime();
		// 返回系统的当前时间。以毫秒计时
		long t3 = System.currentTimeMillis();
		long t4 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		System.out.println(t4-t3);
	
	}
}
