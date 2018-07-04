<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>从复选框中读取数据</h1>
    <ul>
    <li><b>谷歌是否选中：</b><%=request.getParameter("google") %></li>
    <li><b>百度是否选中：</b><%=request.getParameter("baidu") %></li>
    <li><b>阿里是否选中：</b><%=request.getParameter("ali") %></li>
    
    <table width="100%" align="center" border="1">
    <tr bgcolor="#949494">
    <th>参数名</th><th>参数值</th>
    </tr>
    <%
      Enumeration paramerNames= request.getParameterNames();
      while(paramerNames.hasMoreElements()){
    	 String paramerName=(String) paramerNames.nextElement();
    	 out.print("<tr><td>"+paramerName+"</td>\n");
    	 String paramerValue=request.getParameter(paramerName);
    	 out.println("<td>"+paramerValue+"</td></tr>\n");
      }
    %>
    </table>
    
    
</body>
</html>