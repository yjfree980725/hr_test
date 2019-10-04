package lang;

public class MathTest {
	public static void main(String[] args) {
		int a = 4;
		int b = 3;
		//取绝对值
		// int c = a > b ? a - b : b - a;
		System.out.println(Math.abs(a - b));
		//取a b中的最大最小值
		// int c = a > b ? a : b;
		System.out.println("最大值"+Math.max(a, b)+"最小值"+Math.min(a, b));
		//次方
		System.out.println(Math.pow(a, b));
		//平方根
		double d = Math.sqrt(a);
		System.out.println(d);
		//小于参数的最大整数 
		float f =123.55F;
		System.out.println(Math.floor(f));
		//大于参数的最小整数
		float f1 =123.55F;
		System.out.println(Math.ceil(f1));
		
		//四舍五入
		float f2 =123.55F;
		System.out.println(Math.round(f2));
		System.out.println(Math.round(-5.5));
		
		System.out.println("------------------");
		//取随机1-100数
		int c = (int)(Math.random()*100);
		System.out.println(c);
		
	}
}
