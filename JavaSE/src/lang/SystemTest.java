package lang;

import java.util.Arrays;
public class SystemTest {
	public static void main(String[] args) {
		/*
		 * System.out.println("��׼���");
		 * System.err.println("��׼�������");
		 * //ɨ����,ɨ��ӿ���̨������
		 * Scanner sc = new Scanner(System.in);  
		 * String s = sc.next(); 
		 */
		//��������ķ��� 
		//����1��ԭ����
		//����2��ԭ�������ʼλ��
		//����3��Ŀ������
		//����4��Ŀ���������ʼλ��
		//����5��Ҫ�����ĸ���
			int[] a = { 1, 3, 5, 7, 9 }; 
			int[] b = new int[a.length];
			//��ȫ����
		   System.arraycopy(a, 0, b, 0, a.length);
		// System.arraycopy(a, 1, b, 0, a.length-1);
		   	for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" "); 
			}
		System.out.println();
		//System.out.println(Arrays.toString(a));
		//��������
		int[] c = Arrays.copyOf(a, a.length);
		System.out.println(Arrays.toString(c));
		//����������ĵ���
		int[] d = Arrays.copyOfRange(a, 0, a.length-1);
		System.out.println(Arrays.toString(d));
		
		// System.exit(0); �˳� ����ִ��
		long t1 = System.nanoTime();
		long t2 = System.nanoTime();
		// ����ϵͳ�ĵ�ǰʱ�䡣�Ժ����ʱ
		long t3 = System.currentTimeMillis();
		long t4 = System.currentTimeMillis();
		
		System.out.println(t2-t1);
		System.out.println(t4-t3);
	
	}
}
