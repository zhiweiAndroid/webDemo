<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
   String name=URLEncoder.encode(request.getParameter("name"),"utf-8");
   Cookie namec=new Cookie("name",name);
   Cookie urlc=new Cookie("url",request.getParameter("url"));
   
   namec.setMaxAge(60*60*24);
   urlc.setMaxAge(60*60*24);
 
   response.addCookie(namec);
   response.addCookie(urlc);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>get方法获取参数</h3>
	<ul>
		<li>
			<p>
				<b>网站：</b><%=new String(request.getParameter("name").getBytes("ISO8859_1"), "UTF-8")%></p>
		</li>

		<li>
			<p>
				<b>网址：</b><%=request.getParameter("url")%></p>
		</li>
	</ul>
</body>
</html>