<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<%
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);

	response.addHeader("Cache-Control", "no-cache");
	response.addHeader("Cache-Control", "no-store");
	response.addHeader("Cache-Control", "must-revalidate");
%>

</head>

<body>
	获取坐标
	<br>
	<form action="servlet/GetLocationServlet" method="post">
		<input type="hidden" name="dt" value="<%=new Date()%>">
		ibeaconid<input type="text" name="ibeaconid" value="abcde"> <input
			type="submit" value="提交">

	</form>

	<br> 获取广告
	<br>
	<form action="servlet/GetPromotionServlet"  method="get">
		<input type="hidden" name="dt" value="<%=new Date()%>">
		ibeaconid<input type="text" name="ibeaconid" value="abcde">storeno<input
			type="text" name="storeno" value="000000000000001"> <input
			type="submit" value="提交">

	</form>



</body>
</html>
