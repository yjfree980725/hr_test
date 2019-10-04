package lang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		long t = System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(t);
		System.out.println(d2);
		
		System.out.println("----------------");
		
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());
		System.out.println(d);
		
		System.out.println("----------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’ HH:mm:ss E");
		String s = sdf.format(d);
		System.out.println(s);
		
		try {
			Date f = sdf.parse(s);
			System.out.println(f);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
