package string;


/**
   *  退订请将字母顺序反过来先单字母一次再双字母一次
 */
public class StringABC {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean  flag = true;
		// 字符串倒叙输出
		String str = "dfjjvgjstknjidhiohhisgveiffajkcvduchrkgywidbdixbdicgdhsydieoegexbbdifwidifgwpfnfhcyisvsfsyfodlpfdhgeifmevdufkeedwpjwicudfskfiehfjgeifbekfpdjgdufkevfifovdiepghekpfhwlgibeifidbegdibfveugielwhfhfohwhdocjvshdiwi";
		
		// 创建一个空的StringBuilder
		StringBuilder builder = new StringBuilder();// 追加字符串

		builder.append(str);
		// 从后往前插入空格
		int i=builder.length()-1;
		builder.insert(i, ' ');
		while(i>3){
			i = i-2;
			builder.insert(i, ' ');
			i=i-1;
			builder.insert(i, ' ');
		}
		
			/*for (int i=builder.length()-1;i>0;i--) {
				// 指定位置插入逗号
				builder.insert(i, ',');
				if(flag==true){
					builder.insert(i, ',');
				}
				System.out.println(builder.length());
			}*/
		// 将StringBuilder对象转换为String对象并输出
		builder.reverse();
		System.out.println(builder.toString());
	}
}
