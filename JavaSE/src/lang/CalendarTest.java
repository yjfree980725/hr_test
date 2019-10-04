package lang;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {

		/*Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year);
		System.out.println(month + 1);
		System.out.println(day);
		System.out.println(week - 1);
		System.out.println(year + "年" + (month + 1) + "月" + day + "日" + "星期" + (week - 1));

		Date date = cal.getTime();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
		String today = sdf.format(date);
		System.out.println("当前时间:" + today);
*/
		String[] weeks = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

		// 获得日历类的对象
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DAY_OF_MONTH);

		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		int day = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "年" + (month + 1) + "月" + date + "日");
		System.out.println(hour + ":" + min + ":" + sec);
		System.out.println(weeks[day - 1]);

	}

}
