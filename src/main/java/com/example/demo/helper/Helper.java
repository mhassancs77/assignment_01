package com.example.demo.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

	private static String todayDate;

	static void calculateToDayDate() {
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
		    Date now = new Date();
		    String strDate = sdfDate.format(now);
		    todayDate =strDate;
	}

	public static String getTodayDate() {
		if (todayDate == null)
			calculateToDayDate();

		return todayDate;
	}

}
