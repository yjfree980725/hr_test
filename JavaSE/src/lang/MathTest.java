package lang;

public class MathTest {
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		//ȡ����ֵ
		// int c = a > b ? a - b : b - a;
		System.out.println(Math.abs(a - b));
		//ȡa b�е������Сֵ
		// int c = a > b ? a : b;
		System.out.println("���ֵ"+Math.max(a, b)+"��Сֵ"+Math.min(a, b));
		//�η�
		System.out.println(Math.pow(a, b));
		//ƽ����
		double d = Math.sqrt(a);
		System.out.println(d);
		//С�ڲ������������ 
		float f =123.55F;
		System.out.println(Math.floor(f));
		//���ڲ�������С����
		float f1 =123.55F;
		System.out.println(Math.ceil(f1));
		
		//��������
		float f2 =123.55F;
		System.out.println(Math.round(f2));
		System.out.println(Math.round(-5.5));
		
		System.out.println("------------------");
		//ȡ���1-100��
		int c = (int)(Math.random()*100);
		System.out.println(c);
		
	}
}
