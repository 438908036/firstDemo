<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<h3>请输入盘符</h3>
<body>
	<form action="ServletDemo.do" method="post">
	<input name="lujing" type="text" id="lujing"/> 
	<input name="button" type="submit" value="查询">
	</form>
	
	<div>
	<table>
	<c:forEach var="list" items="${list}" varStatus="s">
		<tr>
			<td>
				${s.count }
			</td>
			<td>
				${list }
			</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>