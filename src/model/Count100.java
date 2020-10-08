package model;

import java.util.Calendar;

public class Count100 {

	public long count() {

		 Calendar cal = Calendar.getInstance();
		 //現在から100日足す
		 cal.add(Calendar.DAY_OF_MONTH, 100);
		 // 1970/1/1 から設定した cal(現在時刻+100日) のミリ秒
		 long timeMillis100 = cal.getTimeInMillis();

		 return timeMillis100;
	}
}
