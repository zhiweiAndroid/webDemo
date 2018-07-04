<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>访问量统计</title>
</head>
<body>

<%
   response.setIntHeader("Refresh", 5);
   Integer hitCount=(Integer)application.getAttribute("hitcount");
   if(hitCount==null||hitCount==0){
	   hitCount=1;
	   out.print("欢迎访问我的主页");
   }else{
	   hitCount++;
	  out.print("欢迎再次访问我的主页");
   }
   application.setAttribute("hitcount", hitCount);
%>

<p>页面的访问量为： <%=hitCount %></p>
   
</body>
</html>