package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * 所有日期相关的操作
 */
public class DateTimeUtil {
	/**
	 * 通过传入的字符串格式化时间 yyyy-MM-dd
	 * 
	 * @param str
	 * @return
	 */
	public static Calendar formatTime(String str) {
		SimpleDateFormat formatter = null;
		if (str == null || str.toLowerCase().equals("null"))
			return null;
		if (str.length() > 10) {
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		} else {
			formatter = new SimpleDateFormat("yyyy-MM-dd");
		}
		try {
			Date date = formatter.parse(str);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			return cal;
		} catch (Exception e) {

			return null;
		}
	}

	/**
	 * 获得年-月-日 时-分
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2Full(Calendar cal) {
		if (cal == null)
			return " ";
		return cal2FormatDate(cal, "yyyy-MM-dd HH:mm:ss-SS");
	}

	/**
	 * 获得指定格式的时间 HHmmss
	 * 
	 * @param cal
	 * @return
	 */
	public static String formatHHmmss(Date cal) {
		return date2FormatDate(cal, "HHmmss");
	}

	/**
	 * yyyyMMddHHmmss
	 */
	public static String cal2Number(Date cal) {
		return date2FormatDate(cal, "yyyyMMddHHmmss");
	}

	/**
	 * 获得指定格式的时间
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2Number() {
		return cal2Number(getCalendar(System.currentTimeMillis()));
	}

	/**
	 * 获得yyyy-MM-dd的日期格式
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD(Calendar cal) {
		return cal2FormatDate(cal, "yyyy-MM-dd");
	}

	/**
	 * 获得yyyy-MM-dd的日期格式
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD(Date date) {
		return date2FormatDate(date, "yyyy-MM-dd");
	}

	/**
	 * 获得yyyyMMdd的日期格式
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD() {
		return date2FormatDate(getCalendar(System.currentTimeMillis()),
				"yyyyMMdd");
	}

	/**
	 * 获得yyyyMMdd的日期格式
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YM() {
		return date2FormatDate(getCalendar(System.currentTimeMillis()),
				"yyyyMM");
	}

	/**
	 * 获得当前的年份
	 * 
	 * @return
	 */
	public static String getCurrentYear() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		return cal2FormatDate(cal, "yyyy");
	}

	public static String getCurrentShortYear() {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		return cal2FormatDate(cal, "yy");
	}

	/**
	 * 根据毫秒数获得Calendar对象
	 * 
	 * @param millis
	 * @return
	 */
	public static Date getCalendar(long millis) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(millis);
		return cal.getTime();

	}

	/**
	 * 获取当前日期前30天的日期
	 * 
	 * @return
	 */
	public static Date thirtyDay() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -30);
		return cal.getTime();
		// SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		// return formatter.format(cal.getTime());
	}

	/**
	 * 根据指定的格式和Calendar，返回指定格式的时间
	 * 
	 * @param cal
	 * @param format
	 * @return
	 */
	private static String cal2FormatDate(Calendar cal, String format) {
		Date date = cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String curDate = formatter.format(date);
		return curDate;
	}

	/**
	 * 根据指定的格式和Calendar，返回指定格式的时间
	 * 
	 * @param cal
	 * @param format
	 * @return
	 */
	public static String date2FormatDate(Date date, String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		String curDate = formatter.format(date);
		return curDate;
	}

	public static String databaseDateTimeFormat(String date, String time) {
		String newDate = "";
		String newTime = "";
		if (null != date && !"".equals(date) && date.length() == 8) {
			newDate = date.substring(0, 4) + "-" + date.substring(4, 6) + "-"
					+ date.substring(6, 8);
		}
		if (null != time && !"".equals(time) && time.length() == 6) {
			newTime = time.substring(0, 2) + ":" + time.substring(2, 4) + ":"
					+ time.substring(4, 6);
		}

		return newDate + " " + newTime;
	}

	public static String databaseDateTimeFormatHistory(String date, String time) {
		String newDate = "";
		String newTime = "";
		if (null != date && !"".equals(date) && date.length() == 8) {
			newDate = date.substring(0, 4) + "-" + date.substring(4, 6) + "-"
					+ date.substring(6, 8);
		}
		if (null != time && !"".equals(time) && time.length() == 8) {
			newTime = time;
		}

		return newDate + " " + newTime;
	}

	/**
	 * yyyyMMdd
	 */
	public static String date2yyyyMMdd(Date date) {
		return date2FormatDate(date, "yyyyMMdd");
	}

	/**
	 * 获取当前日期前n天的日期
	 * 
	 * @return
	 */
	public static String nDay(int i) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, i);
		// return cal.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		return formatter.format(cal.getTime());
	}

}
