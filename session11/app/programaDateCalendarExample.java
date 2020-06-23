package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class programaDateCalendarExample {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		Date d = Date.from(Instant.parse("2020-04-08T11:34:07Z"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minute = cal.get(Calendar.MINUTE);
		System.out.println("Minute:"+ minute);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month:"+ month);
		//cal.add(Calendar.HOUR_OF_DAY, 3);
		//d = cal.getTime();
		
		System.out.println(sdf.format(d));
	}
}
