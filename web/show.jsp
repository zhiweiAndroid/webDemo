<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>  
      <ul style="list-style:none;line-height:30px">  
         <li>输入用户姓名：<%=new String(request.getParameter("name").getBytes("ISO8859_1"),"UTF-8")%></li>  
         <li>选择性别: <%=new String(request.getParameter("sex").getBytes("ISO8859_1"),"UTF-8")%></li>  
         <li>选择密码提示问题: <%=new String(request.getParameter("question").getBytes("ISO8859_1"),"UTF-8")%></li>  
         <li>请输入问题答案: <%=new String(request.getParameter("key").getBytes("ISO8859_1"),"UTF-8") %></li>  
         <li>  
                                        请选择个人爱好:   
              <%  
                 String[] like=request.getParameterValues("like");  
                 for(int i=0;i<like.length;i++)  
                 {  
              %>  
              <%=new String(like[i].getBytes("ISO8859_1"),"UTF-8")+"  "%>  
              <% } %>  
         </li>           
      </ul>  
</body>
</html>