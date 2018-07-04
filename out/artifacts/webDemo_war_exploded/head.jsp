<%@page import="java.io.*,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
     <h2>HTTP 头部请求实例</h2>
      <table width="100%" border="1" align="center">
      <tr bgcolor="#949494">
      <th>Head Name</th>
      <th>Head Value</th>
      </tr>
      <%
       Enumeration headNamers= request.getHeaderNames();
       while(headNamers.hasMoreElements()){
    	 String headParam= (String) headNamers.nextElement();
    	 out.print("<tr><td>"+headParam+"</td>");
    	 String headValue=request.getHeader(headParam);
    	 out.println("<td>"+headValue+"</td></tr>");
       }
      %>
      
      </table>
      
      <h3>头部响应 刷新 5s</h3>
      <% 
      response.setIntHeader("Refresh", 5);
      String am_pm;
      Calendar calendar=new GregorianCalendar();
      int hour=calendar.get(Calendar.HOUR);
      int minute=calendar.get(Calendar.MINUTE);
      int second=calendar.get(Calendar.SECOND);
      if(calendar.get(Calendar.AM_PM)==0)
    	  am_pm="AM";
      else
    	  am_pm="PM";
      String T=hour+":"+minute+":"+second+" "+am_pm;
      out.print("当前时间是：" +T+"\n");
      
      %>
      

</body>
</html>