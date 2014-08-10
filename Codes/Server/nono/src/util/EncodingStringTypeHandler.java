package util;

import java.io.UnsupportedEncodingException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class EncodingStringTypeHandler implements TypeHandler<String> {

	private static String ISO88591_ENCODE = "ISO8859_1";
	private static String UTF8_ENCODE = "UTF-8";
	private static String GBK_ENCODE = "GBK";

	// 返回编码格式
	private String getEncode(String str) {
		String encode = null;
		if (verifyEncode(str, GBK_ENCODE)) {
			encode = GBK_ENCODE;
		} else if (verifyEncode(str, ISO88591_ENCODE)) {
			encode = ISO88591_ENCODE;
		} else if (verifyEncode(str, UTF8_ENCODE)) {
			encode = UTF8_ENCODE;
		}

		return encode;
	}

	// 判断编码格式是否相符
	private boolean verifyEncode(String str, String encode) {
		try {
			if (str.equals(new String(str.getBytes(encode), encode))) {
				return true;
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return false;
	}

	public String getResult(ResultSet rs, String columnName)
			throws SQLException {
		// TODO Auto-generated method stub
		try {
			if (null != rs.getString(columnName)) {
				String columnValue = rs.getString(columnName);
				if (ISO88591_ENCODE.equals(getEncode(columnValue))) {
					return new String(rs.getString(columnName).getBytes(
							ISO88591_ENCODE), GBK_ENCODE);
				}
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return rs.getString(columnName);
	}

	public String getResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return StringUtils.isoTOGBK(arg0.getString(arg1));
	}

	public String getResult(CallableStatement cs, int columnIndex)
			throws SQLException {
		// TODO Auto-generated method stub
		return cs.getString(columnIndex);
	}

	public void setParameter(PreparedStatement ps, int i, String parameter,
			JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub

		try {
			String paramStr = null;
			if (null != parameter) {
				paramStr = (String) parameter;
				if (GBK_ENCODE.equals(getEncode(paramStr))) {
					if (null != parameter) {
						ps.setString(
								i,
								new String(((String) parameter)
										.getBytes(GBK_ENCODE), ISO88591_ENCODE));
					}
				}
			} else {
				ps.setString(i, (String) parameter);
			}
		} catch (UnsupportedEncodingException e) {
			ps.setString(i, (String) parameter);
		}

	}

}
