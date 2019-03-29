<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="js/jquery/2.0.0/jquery.min.js"></script>
<link href="css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="css/bootstrap/3.3.6/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	li{
	float:left;
	}
	li a{
		display:block;
		color:black;
		text-align:center;
		padding:14px 16px;
		text-decoration:none;
	}
	#top {
    list-style-type: none;  
    margin: 0;
    padding: 0;
    overflow:hidden;
    background-color: #F0F0F0;
	}
	#bottom{
	list-style-type: none;  
    margin: 0;
    padding: 0 0 0 0;
    
    overflow:hidden;
    background-color: #F0F0F0;
	}
	}
	li a:hover{
		background-color: #4CAF50;
		color:white;
	}
	
	a:link{color:#202020;text-decoration:none;}
	a:visited{color:#202020;text-decoration:none;}
	a:hover{color:#FF6600;}
	#logo{
		display:block;
		text-align:center;
		padding:14px 16px;
		text-decoration:none;
		color:#CC6600;
		size:15px;
	}
	#sousuo{
		display:block;
		text-align:center;
		padding:10px 12px;
		text-decoration:none;
		size:15px;
	}
</style>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<ul id="top">
		<li id="logo">随变兔</li>
		<li ><a href="SuiBianTu.jsp">首页</a></li>
		<li ><a href="ListCourseServlet">课程</a></li>
		<li ><a href="jianzhi.jsp">兼职</a></li>
		<c:if test="${empty user }"><li style="float:right" ><a href="Login.jsp">登陆</a></li></c:if>
		<c:if test="${!empty user }"><li style="float:right" ><a href="Logoff">注销</a></li></c:if>
		<c:if test="${!empty user }"><li style="float:right" ><a href="User.jsp">${user.name }</a></li></c:if>
		<c:if test="${empty user }"><li style="float:right" ><a href="Register.jsp">注册</a></li></c:if>
	</ul>
	</nav>
	<nav class="navbar navbar-default navbar-fixed-bottom">
	<ul id="bottom">
		<div style="text-align:center">
 版权所有
</div>
	</ul>
	</nav>
</body>
</html>