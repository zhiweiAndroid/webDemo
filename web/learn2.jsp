<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% int day=5; %>
<% int fontsize=0,b=0; %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    Hello world!<br/>
    <%
    out.println("你的IP地址是 :"+request.getRemoteAddr());
    %>
    <%--这是一行注释 --%>
      <h3>这是一个switch  语句：</h1>
    <%
    switch (day){
        case 0:
        	out.println("星期日");
    	    break;
        case 1:
        	out.println("星期1");
        	break;
        case 2:
        	out.println("星期2");
        	break;
        case 3:
        	out.println("星期3");
        	break;
        case 4:
        	out.println("星期4");
        	break;
        case 5:
        	out.println("星期5");
        	break;
        case 6:
        	out.println("星期6");
        	break;
    }	
    %>
    <h3>这是一个  for 循环：</h3>
    <%for(fontsize=1;fontsize<=3;fontsize++){ %>
    <font color="green" size="<%=fontsize %>">今天天气真好！<br/></font>
    <%}%>
    
    <h3>这是一个while 循环：</h3>
    <%while(b<=3) {%>
     <font color="green" size="<%=b %>">你在哪里？<br/></font>
     <% b++; %>
    <%}%>
    
     <p>include 实例操作：</p>
   <%--   <jsp:include page="date.jsp" flush="true"></jsp:include> --%>
     <jsp:useBean id="test" class="test.TestBean" ></jsp:useBean>
     <jsp:setProperty property="message" name="test" value="这是一个userbean"/>
     <p>这是一个输出：</p>
     <jsp:getProperty property="message" name="test"/>
     
    
     
     
     
     
    
</body>
</html>