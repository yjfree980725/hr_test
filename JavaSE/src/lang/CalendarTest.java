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
		System.out.println(year + "��" + (month + 1) + "��" + day + "��" + "����" + (week - 1));

		Date date = cal.getTime();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss E");
		String today = sdf.format(date);
		System.out.println("��ǰʱ��:" + today);
*/
		String[] weeks = { "������", "����һ", "���ڶ�", "������", "������", "������", "������" };

		// ���������Ķ���
		Calendar c = Calendar.getInstance();

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DAY_OF_MONTH);

		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		int day = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		System.out.println(hour + ":" + min + ":" + sec);
		System.out.println(weeks[day - 1]);

	}

}
