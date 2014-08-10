package util;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 字符串相关操作的工具类
 * 
 */
public class StringUtils {
	/**
	 * 判断一个String不为空或者不是空串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean notNull(String str) {
		if (str != null && !str.trim().equals(""))
			return true;
		else
			return false;
	}

	/**
	 * 将blank转换成null字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String blank2Null(String str) {
		if (str.trim().equals(""))
			return "null";
		else
			return str;
	}

	/**
	 * 将null字符串，Null对象转换成""
	 * 
	 * @param str
	 * @return
	 */
	public static String null2Blank(String str) {
		if (null == str || str.trim().toLowerCase().equals("null"))
			return "";
		return str;
	}

	/**
	 * 为AdminService服务(updateModuleByRole).模块的编号的格式为"_id",目标是将"_"去掉，将ID转换成Long.
	 * 
	 * @param str
	 * @return
	 */
	public static long str2Long(String str) {
		return Long.parseLong(str.substring(str.indexOf("_") + 1));
	}

	/**
	 * 将GBK编码的字符转换成ISO
	 * 
	 * @param str
	 * @return
	 */
	public static String gbk2UTF(String str) {
		if (str == null)
			return str;
		else {
			try {
				return new String(str.getBytes("GBK"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				return str;
			}
		}
	}

	/**
	 * 将GBK编码的字符转换成ISO
	 * 
	 * @param str
	 * @return
	 */
	public static String gbk2ISO(String str) {
		if (str == null)
			return str;
		else {
			try {
				return new String(str.getBytes("GBK"), "ISO-8859-1");
			} catch (UnsupportedEncodingException e) {
				return str;
			}
		}
	}
	
	public static String utf82ISO(String str) {
		if (str == null)
			return str;
		else {
			try {
				return new String(str.getBytes("UTF-8"), "ISO-8859-1");
			} catch (UnsupportedEncodingException e) {
				return str;
			}
		}
	}

	/**
	 * 将ISO编码的字符转换成GBK
	 * 
	 * @param str
	 * @return
	 */
	public static String iso2GBK(String str) {

		return str;
	}

	/**
	 * 将ISO编码的字符转换成GBK
	 * 
	 * @param str
	 * @return
	 */
	public static String isoTOGBK(String str) {
		if (str == null || str.equals("null") || str.trim().equals(""))
			return " ";
		else {
			try {
				return new String(str.getBytes("ISO-8859-1"), "GBK");
			} catch (UnsupportedEncodingException e) {
				return str;
			}
		}
	}
	
	
	/**
	 * 将ISO编码的字符转换成GBK
	 * 
	 * @param str
	 * @return
	 */
	public static String isoTOUTF8(String str) {
		if (str == null || str.equals("null") || str.trim().equals(""))
			return " ";
		else {
			try {
				return new String(str.getBytes("ISO-8859-1"), "UTF-8");
			} catch (UnsupportedEncodingException e) {
				return str;
			}
		}
	}

	/**
	 * 当Struts配置redirect="true"的时候，参数进行了处理，这个时候需要将字符串转换成URL编码。
	 * 
	 * @param str
	 * @return
	 */
	public static String toEncoder(String str) {
		try {
			return URLEncoder.encode(str, "GBK");
		} catch (Exception e) {
			return str;
		}
	}

	/**
	 * 将URL编码转换成可以显示的编码。
	 * 
	 * @param str
	 * @return
	 */
	public static String urlDecoder(String str) {
		try {
			String temp = URLDecoder.decode(str, "GBK");
			return temp;
		} catch (Exception e) {
			return str;
		}

	}

	/**
	 * 为ParamAddAction服务的，将选择的卡类型,这个时候是数组，转换成String
	 * 
	 * @param str
	 * @return
	 */
	public static String issuer(String[] str) {
		String end = "";
		if (str != null) {
			int l = 0;
			for (int i = 0; i < str.length; i++) {
				l += Integer.parseInt(str[i]);
			}
			end = Integer.toBinaryString(l);
			int endLength = end.length();
			for (int i = 0; i < 5 - endLength; i++) {
				end = "0" + end;
			}
			return end;
		} else {
			return "00000";
		}
	}

	/**
	 * 为风险参数服务的，对控制项代码进行转换
	 * 
	 * @param str
	 * @return
	 */
	public static String ctrl_id(String[] str) {
		String end = "";
		if (str != null) {
			int l = 0;
			for (int i = 0; i < str.length; i++) {
				l += Integer.parseInt(str[i]);
			}
			end = Integer.toBinaryString(l);
			int endLength = end.length();
			for (int i = 0; i < 5 - endLength; i++) {
				end = "0" + end;
			}
			return end + "000";
		} else {
			return "00000000";
		}
	}

	public static String ctrl_idSearch(String[] str) {
		String end = "";
		if (str != null) {
			int l = 0;
			for (int i = 0; i < str.length; i++) {
				l += Integer.parseInt(str[i]);
			}
			end = Integer.toBinaryString(l);
			int endLength = end.length();
			for (int i = 0; i < 5 - endLength; i++) {
				end = "0" + end;
			}
			return end + "000";
		} else {
			return "";
		}
	}

	/**
	 * 将卡号中间部分进行加密，增加一个返回监控页面的字段
	 * 
	 * @param str
	 * @return
	 */
	public static String changeCard(String str) {
		if (str != null)
			str = str.trim();
		else
			str = "";
		if (str.length() > 10) {
			String end = str.substring(0, 6);
			end += "******";
			end += str.substring(12);
			return end;
		}
		return str;
	}

	/**
	 * 将卡号中间部分进行加密，增加一个返回监控页面的字段
	 * 
	 * @param str
	 * @return
	 */
	public static String changeCard(String str, boolean display) {
		if (!display) {
			if (str != null)
				str = str.trim();
			else
				str = "";
			if (str.length() > 10) {
				String end = str.substring(0, 6);
				end += "******";
				end += str.substring(12);
				return end;
			}
		}
		return str;
	}

	/**
	 * 生成传真代码 长度为6位
	 * 
	 * @param str
	 * @return
	 */
	public static String faxCode(String str) {
		String end = "";
		for (int i = 0; i < (6 - str.length()); i++) {
			end += "0";
		}
		end += str;
		return end;
	}

	/**
	 * 根据文件名称获得文件对应的具体路径
	 * 
	 * @param str
	 * @return
	 */
	public static String refno2FaxFile(String str) {
		return "excel/" + str.substring(0, 2) + "/" + str + ".xls";
	}

	/**
	 * 判断文件是否存在
	 * 
	 * @param fileno
	 * @return
	 */
	public static boolean fileIsExist(String fileno) {
		File fFile = new File(fileno);
		return fFile.exists();
	}

	/**
	 * 将数组参数转换成String
	 * 
	 * @param strs
	 * @return
	 */
	public static String arr2String(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String end = "";
		for (int i = 0; i < strs.length; i++) {
			end += "'" + strs[i] + "',";
		}
		return end.substring(0, end.length() - 1);
	}

	/**
	 * 截取汉字字符串转换为：String
	 * 
	 * @param strs
	 * @return
	 */
	public static String string2String(String str, int len) {

		if (str.getBytes().length > len) {

			byte[] bt = str.getBytes();
			byte[] btTmp = new byte[len];
			for (int i = 0; i < btTmp.length; i++) {
				System.out.println(bt[i]);
				btTmp[i] = bt[i];
			}
			str = new String(btTmp);

		}
		return str;
	}

	public String toCardno(String str) {
		System.out.println(str.length());
		StringBuffer stb = new StringBuffer();
		if (str.length() == 0) {
			return stb.toString();
		}
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (i > 10 && i < 18) {
				ch[i] = ch[i];
			} else {
				ch[i] = '*';
			}
			stb.append(ch[i]);
		}
		System.out.println(stb.toString());
		return stb.toString();
	}

	public String toAllcardno(String str) {
		String st = "";
		String[] cbs = str.split(" ");
		for (int i = 0; i < cbs.length; i++) {
			st = st += toCardno(cbs[i]);
		}
		return st;
	}

	public String toDate(String str) {
		String s = "";
		s += str.substring(0, 4) + "-" + str.substring(4, 6) + "-"
				+ str.substring(6, 8) + " " + str.substring(8, 10) + ":"
				+ str.substring(10, 12);
		return s;
	}

}
