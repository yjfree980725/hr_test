package string;

import java.util.Scanner;

public class Lianxi4 {
	
	public static void main(String[] args) {
		Test();
	}
	
	public static void Test(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�������ַ:");
		String str = sc.next();
		
		int a = str.indexOf("@");
		int b = str.lastIndexOf("@");
		int c = str.indexOf(".");
		int d = str.lastIndexOf(".");
		
		if(a==b && c==d){
	
		}else{
			System.out.println("ֻ����һ��@��.����������");
			Test();
			return;
		}
		
		if(a<c){
			
		}else{
			System.out.println("@��.֮ǰ������������");
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
				System.out.println("@��ǰ������ĸ�����֣�����������");
				Test();
				return;
			}
		}
		
		if(str.endsWith("com") || str.endsWith("cn")){
			
		}else{
			System.out.println("��βֻ��Ϊcom��cn������������");
			Test();
			return;
		}
		System.out.println("�����ַ���Ϲ���");
	}

}
