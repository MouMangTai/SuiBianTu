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
<script src="../static/jquery-3.3.1.min.js"></script>

<style type="text/css">
		.div1{
			width:100%;
			height:360px;
			border: 1px solid black;
			padding-top: 20px ;
			padding-bottom:20px;
			padding-left:10px;
			padding-right:10px;
			text-align:center;
		}
		.div2{
			width:100%;
			height:1200px;
			border:1px solid black;
			padding-top: 20px ;
			padding-bottom:20px;
			padding-left:10px;
			padding-right:10px;
		}
		.div3{
			width:100%;
			height:400px;
		}
		.div2 img{
			float:left;
		}
		.div2 p{
			//float:right;
			text-indent:2px;
			font-size:20px;
			font-weight:bolder;
		}
		.div1 p{
			text-align:left;
			font-weight:bolder;
		}
		
	</style>

<body>
	<jsp:include page="DaoHangLan.jsp" flush="true"/>
	<center><img style="margin:10px"src="https://img.alicdn.com/tps/i4/TB1No3uHgHqK1RjSZFPSuwwapXa.jpg_1080x1800Q60s50.jpg"></center>
	<div class="div1">
		<p>推荐</p>
		<a>
		<img src="images/1.jpg" width="300px">
		</a>
		<a>
		<img src="images/1.jpg" width="300px">
		</a>
		<a>
		<img src="images/1.jpg" width="300px">
		</a>
	</div>
	
	<br><br>
	
	<div class="div2">
	<div class="div3">
		<a>
		<img src="images/1.jpg" width="280px">
		<p class="p2">教育机构1简介：</p>
		</a>
	</div>
	<div class="div3">
<a>
<img src="images/1.jpg" width="280px">
<p>教育机构1简介：</p>
</a>
</div>
<div class="div3">
<a>
<img src="images/1.jpg" width="280px">
<p>教育机构1简介：</p>
</a>
</div>
</div>

	
</body>
</html>