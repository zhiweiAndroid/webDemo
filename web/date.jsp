<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:text>
	<![CDATA[<!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"DTD/xhtml1-strict.dtd">]]>
</jsp:text>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- <p>今天的日期是： <%=(new Date()).toLocaleString() %></p> --%>

	<jsp:element name="xmlElement">
<jsp:attribute name="xmlElementAttr">
   属性值
</jsp:attribute>
<jsp:body>
   XML 元素的主体
</jsp:body>
</jsp:element>

	<books> <book><jsp:text>  
    Welcome to JSP Programming
</jsp:text></book></books>

	<%
		Date date = new Date();
		out.print("<h2 align=\"center\">" + date.toString() + "</h2>");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH : mm : ss");
		out.print("<h2 align=\"center\">" + format.format(date) + "</h2>");
	%>



</body>
</html>