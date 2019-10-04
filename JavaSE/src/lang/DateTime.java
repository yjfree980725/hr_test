package lang;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	
	public static void main(String[] args) throws Exception {
		
		/*Date date = new Date();
		long a = date.getTime();
		System.out.println(a);
		
		int sum=0;
		for(long i=0;i<222222222;i++){
			sum+=1;
		}
		Date date1 = new Date();
		long b = date1.getTime();
		System.out.println(b);
		
		System.out.println(b-a);*/
		
		//字符串 转成 工具类Date 再转SQL DATE 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		Date d = sdf1.parse("2010/10/12");
		java.sql.Date d1 = new java.sql.Date(d.getTime());
		System.out.println(d1);
	}

}
