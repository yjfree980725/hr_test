package string;

public class Lianxi1 {
	public static void main(String[] args) {
		String url = "http://www.baidu.com/a/reg.html?id=123&uname=abcd";
		int start = url.indexOf(".");
		url = url.substring(start+1);
		System.out.println(url);

		int end = url.indexOf("/");
		url = url.substring(0, end);
		System.out.println(url);
		
		/*String str1 = url.substring(url.indexOf(".")+1, url.indexOf("m")+1);
		System.out.println(str1);*/
	}
}
