package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * ����������صĲ���
 */
public class DateTimeUtil {
	/**
	 * ͨ��������ַ�����ʽ��ʱ�� yyyy-MM-dd
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
	 * �����-��-�� ʱ-��
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
	 * ���ָ����ʽ��ʱ�� HHmmss
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
	 * ���ָ����ʽ��ʱ��
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2Number() {
		return cal2Number(getCalendar(System.currentTimeMillis()));
	}

	/**
	 * ���yyyy-MM-dd�����ڸ�ʽ
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD(Calendar cal) {
		return cal2FormatDate(cal, "yyyy-MM-dd");
	}

	/**
	 * ���yyyy-MM-dd�����ڸ�ʽ
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD(Date date) {
		return date2FormatDate(date, "yyyy-MM-dd");
	}

	/**
	 * ���yyyyMMdd�����ڸ�ʽ
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YMD() {
		return date2FormatDate(getCalendar(System.currentTimeMillis()),
				"yyyyMMdd");
	}

	/**
	 * ���yyyyMMdd�����ڸ�ʽ
	 * 
	 * @param cal
	 * @return
	 */
	public static String cal2YM() {
		return date2FormatDate(getCalendar(System.currentTimeMillis()),
				"yyyyMM");
	}

	/**
	 * ��õ�ǰ�����
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
	 * ���ݺ��������Calendar����
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
	 * ��ȡ��ǰ����ǰ30�������
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
	 * ����ָ���ĸ�ʽ��Calendar������ָ����ʽ��ʱ��
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
	 * ����ָ���ĸ�ʽ��Calendar������ָ����ʽ��ʱ��
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
	 * ��ȡ��ǰ����ǰn�������
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
