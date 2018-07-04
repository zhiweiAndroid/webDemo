<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	Date createTime = new Date(session.getCreationTime());
	Date lastTime = new Date(session.getLastAccessedTime());

	String title = "再次访问菜鸟教程实例";
	Integer visitCount = new Integer(0);
	String visitCountKey = new String("visitCountKey");
	String userID = new String("ABC");
	String userKey = new String("userID");

	if (session.isNew()) {
		title = "访问菜鸟教程实例";
		session.setAttribute(visitCountKey, visitCount);
		session.setAttribute(userKey, userID);
	} else {
		visitCount = (Integer) session.getAttribute(visitCountKey);
		visitCount++;
		userID = (String) session.getAttribute(userKey);
		session.setAttribute(visitCountKey, visitCount);
	}
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>session 跟踪</title>
</head>
<body>
	<table align="center" border="1" width="100%">
	
		<tr bgcolor="#949494">
			<th>session</th>
			<th>值</th>
		</tr>
  
		<tr>
           <td>id</td>
           <td><% out.print(session.getId()); %></td>
		</tr>

        <tr>
           <td>初次访问时间</td>
           <td><% out.print(createTime); %></td>
		</tr>

        <tr>
           <td>最后访问时间</td>
           <td> <% out.print(lastTime); %></td>
		</tr>

        <tr>
           <td>用户</td>
           <td> <% out.print(userID); %></td>
		 </tr>

         <tr>
           <td>访问次数</td>
           <td> <% out.print(visitCount); %></td>
		 </tr>


	</table>


</body>
</html>