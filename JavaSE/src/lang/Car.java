package lang;

public class Car {

	// ���췽��
	public Car() {
		System.out.println("���ù��췽��");
	}

	// ��Ա����
	@SuppressWarnings("unused")
	private Pinpai pinpai = new Pinpai();
	//��̬����
	@SuppressWarnings("unused")
	private static Xinghao xhao = new Xinghao();
	// �����
	{
		System.out.println("���ô����");
	}
	
	//��̬�����
	static {
		System.out.println("static�����");
	}

	// ��Ա����
	public void run() {
		System.out.println("��������ʻ");
	}

	public static void main(String[] args) {
		System.out.println("������");
		Car c = new Car();
		c.run();
	}

}
