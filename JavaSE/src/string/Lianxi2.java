package string;

public class Lianxi2 {
	public static void main(String[] args) {

		String url = "abcdccba";
		for (int i = 0; i < url.length() / 2; i++) {
			char c1 = url.charAt(i);
			char c2 = url.charAt(url.length() - i - 1);
			if (c1 != c2) {
				System.out.println(url + "不是回文字符串");
				return;
			}
		}
		System.out.println(url + "是回文字符串");
	}
}
