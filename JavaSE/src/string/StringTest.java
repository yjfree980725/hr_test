package string;

public class StringTest {
	public static void main(String[] args) {
		String str = " YuanJian.com ";
		// �ַ�������
		int a = str.length();
		System.out.println(a);
		// ��ȡ�ַ��±��Ӧ���ַ�
		char at = str.charAt(1);
		System.out.println(at);
		// �����ַ���һ�γ��ֵ��±�
		int b = str.indexOf("an");
		System.out.println(b);
		// �����ַ����һ�γ��ֵ��±�
		int c = str.lastIndexOf("an");
		System.out.println(c);
		// ��ȡ���ַ������ȴӿ�ʼ��
		int d = str.indexOf("n");
		String str1 = str.substring(d + 1);
		System.out.println(str1 + "<><>");// Jian.com
		
		int f = str.indexOf(".");
		String str2 = str.substring(0, f);
		System.out.println(str2);
		// ȥ��ǰ��ո�
		String str3 = str.trim();
		System.out.println(str3);
		// ת����Сд Сд ��д
		String str4 = str.toLowerCase();
		System.out.println(str4);
		String str5 = str.toUpperCase();
		System.out.println(str5);
		// �ַ���ת��������
		//String m = "10";
		String s = "123";
		//int n = Integer.parseInt(m);
		Integer l = Integer.valueOf(s);
		//int s2 = l;
		System.out.println(l + 1);
		// ����ת�����ַ���
		//int i = 10;
		//String c1 = Integer.toString(i);// һ
		//String d1 = String.valueOf(i); // ��
		//String f1 = i + ""; // ���
		System.out.println(f + 1);

	}
}
