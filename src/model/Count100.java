package model;

import java.util.Calendar;

public class Count100 {

	public void count() {
		/*
		LocalDate date1;
		LocalDate date2 = date1.plusDays(100);

		System.out.println(date2);
		LocalDate date3 = LocalDate.now();

		long timeMillis1 = date1.getTimeInMillis();
		long currentTimeMillis = System.currentTimeMillis();

		*/

		 Calendar cal = Calendar.getInstance();
		 //現在から100日足す
		 cal.add(Calendar.DAY_OF_MONTH, 100);
		 // 1970/1/1 から設定した cal のミリ秒
		 long timeMillis = cal.getTimeInMillis();

		 // 現在時刻のミリ秒
		 long currentTimeMillis = System.currentTimeMillis();

		 // 差分のミリ秒
		 long diff = timeMillis - currentTimeMillis;

	        // ミリ秒から秒へ変換
	        diff = diff / 1000;
	        // minutes
	        diff = diff / 60;
	        // hour
	        diff = diff / 60;
	        // day
	        diff = diff / 24;

		 System.out.println(diff);
	}
}
