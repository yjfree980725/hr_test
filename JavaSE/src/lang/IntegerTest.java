package lang;

public class IntegerTest {
	public static void main(String[] args) {
		
		//Integer t1 = new Integer(100);
		//Integer t2 = new Integer("200");		
		Integer t3 = 100;
		
		double b1 = t3.doubleValue();
		System.out.println(b1);
		
		int t4 = Integer.parseInt("12345");
		System.out.println(t4);
		
		//�������ַ���������ָ���Ľ���ת��������(ʮ����)
		int t5 = Integer.parseInt("12345",6);
		System.out.println(t5);
		//������ת�����ַ���
		String s = Integer.toString(1234567);
		System.out.println(s+1);
		//������ת����ָ�����Ƶ��ַ���
		String s1 = Integer.toString(1865, 6);
		System.out.println(s1);
		//ת����2����
		System.out.println(Integer.toBinaryString(-255));
		
		System.out.println(Integer.toString(-255, 2));
		
		String ss = 1234567+"";
		System.out.println(ss+1);
		
		
	}
}
