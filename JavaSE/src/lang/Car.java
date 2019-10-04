package lang;

public class Car {

	// 构造方法
	public Car() {
		System.out.println("调用构造方法");
	}

	// 成员属性
	@SuppressWarnings("unused")
	private Pinpai pinpai = new Pinpai();
	//静态属性
	@SuppressWarnings("unused")
	private static Xinghao xhao = new Xinghao();
	// 代码块
	{
		System.out.println("调用代码块");
	}
	
	//静态代码块
	static {
		System.out.println("static代码块");
	}

	// 成员方法
	public void run() {
		System.out.println("汽车在行驶");
	}

	public static void main(String[] args) {
		System.out.println("主函数");
		Car c = new Car();
		c.run();
	}

}
