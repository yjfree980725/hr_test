package string;

public class Lianxi3 {

	public static void main(String[] args) {

		// ����һ���յ�StringBuilder

		StringBuilder str = new StringBuilder();// ׷���ַ���

		str.append("jaewkjldfxmopzdmI");// �Ӻ���ǰÿ����λ���붺��

		for (int i = str.length() - 3; i > 0; i = i - 3) {
			// ָ��λ�ò��붺��
			str.insert(i, ',');
		}
		// ��StringBuilder����ת��ΪString�������
		System.out.println(str.toString());
		
		test();
	}

	public static void test() {
		// ����һ���ַ���
		String s = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
		// ���ִ���
		int num = 0;

		// ѭ������ÿ���ַ����ж��Ƿ����ַ� a ������ǣ��ۼӴ���
		for (int i = 0; i < s.length(); i++) {
			// ��ȡÿ���ַ����ж��Ƿ����ַ�a
			if (s.charAt(i) == 'a') {
				// �ۼ�ͳ�ƴ���
				num++;
			}
		}
		System.out.println("�ַ�a���ֵĴ�����" + num);
	}
}
