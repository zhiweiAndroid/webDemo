<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
     Cookie cookie=null;
     Cookie [] cookies=null;
     cookies=request.getCookies();
     if(cookies!=null){
    	 out.print("<h2>查找cookie 的值 </h2>");
    	 for(int i=0;i<cookies.length;i++){
    		 cookie=cookies[i];
    		 if(cookie.getName().compareTo("name")==0){
    			cookie.setMaxAge(0);
    			response.addCookie(cookie);
    			out.print("删除cookie :"+cookie.getName()+"<br>");
    		 }
    		 out.print("cookie的名字是：" +cookie.getName()+"<br>");
    		 out.print("cookie的值是：" +URLDecoder.decode(cookie.getValue(), "utf-8")+"<br>");
    		 out.print("------------------------------------<br>");
    	 }
     }else{
    	 out.print("<h2>没有找cookie 的值 </h2>");
     }
     
  
  
  %>
</body>
</html>