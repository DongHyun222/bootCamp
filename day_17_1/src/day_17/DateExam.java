package day_17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExam {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + ", " + month + ", " + day);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		String today = dateFormat.format(new Date());
		System.out.println(today);
	}
}
