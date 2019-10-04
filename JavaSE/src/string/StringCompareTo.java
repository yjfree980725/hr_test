package string;

import java.util.Arrays;

public class StringCompareTo {
	
	public static void main(String[] args) {
		
		String[] str = {"door","apple","Applet","bg","boy","girl","Boy","Cdo","cap"};
		int[] num = {8,5,9,6,4,7,2,3,1};
		
		
		System.out.println("≈≈–Ú«∞£∫");
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("≈≈–Ú«∞£∫");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		Arrays.sort(str);
		Arrays.sort(num);
		
	/*	Arrays.sort(str, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return 0;
			}
			
		});*/
		
		System.out.println("≈≈–Ú∫Û£∫");
		for(int i=0;i<str.length;i++){
			System.out.print(str[i] +" ");
		}
		
		System.out.println();
		
		System.out.println("≈≈–Ú∫Û£∫");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i] +" ");
		}
		
	}

}
