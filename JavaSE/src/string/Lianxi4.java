package string;

import java.util.Scanner;

public class Lianxi4 {
	
	public static void main(String[] args) {
		Test();
	}
	
	public static void Test(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个邮箱地址:");
		String str = sc.next();
		
		int a = str.indexOf("@");
		int b = str.lastIndexOf("@");
		int c = str.indexOf(".");
		int d = str.lastIndexOf(".");
		
		if(a==b && c==d){
	
		}else{
			System.out.println("只能有一个@和.请重新输入");
			Test();
			return;
		}
		
		if(a<c){
			
		}else{
			System.out.println("@在.之前，请重新输入");
			Test();
			return;
		}
		for(int i=0;i<c;i++){
			if(i==a){
				continue;
			}
			char ch = str.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
				
			}else{
				System.out.println("@的前后是字母或数字，请重新输入");
				Test();
				return;
			}
		}
		
		if(str.endsWith("com") || str.endsWith("cn")){
			
		}else{
			System.out.println("结尾只能为com或cn，请重新输入");
			Test();
			return;
		}
		System.out.println("邮箱地址符合规则");
	}

}
