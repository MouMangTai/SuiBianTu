<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	#box1{
		margin:0 auto;
		position:relative;
		top:60px;
		height:130px;
		width:1000px;
		border:1px solid black;
		padding-left:10px ;
	}
	#box2{
		margin:0 auto;
		position:relative;
		top:70px;
		height:500px;
		width:1000px;
	}
	.box3{
		width:100%;
		margin-top:5px;
	}
	span{
		margin-left:10px;
	}
	#box4{
		height:500px;
		width:1000px;
		padding:10px;
	}
	.course{
		width:900px;
		height:200px;
	}
</style>
<body>
	<jsp:include page="DaoHangLan.jsp" flush="true"/>
	
		<div id="box1">
			<div class="box3">
			科目:
			</div>
			<div class="box3">
			年级:
			</div>
			<div class="box3">
			类型: <a href="SelectServlet?type=5&name=在线课程"><span>在线课程</span></a><a href="SelectServlet?type=5&name=线下课程"><span>线下课程</span></a>
			</div>
			<div class="box3">
			来源: <a href="SelectServlet?type=6&name=名校名师"><span>名校名师</span></a><a href="SelectServlet?type=6&name=个人"><span>个人</span></a>
			<a href="SelectServlet?type=6&name=课外辅导机构"><span>课外辅导机构</span></a>
			</div>
			<div class="box3">
			排序: <a href="SelectServlet?type=1"><span>按人气渐升</span></a><a href="SelectServlet?type=2"><span>按人气渐降</span></a>
			<a href="SelectServlet?type=3"><span>按费用渐升</span></a><a href="SelectServlet?type=4"><span>按费用渐降</span></a>
			<span>按发布日期渐升</span><span>按发布日期渐降</span>
			</div>
		</div>
		<div id="box2">
			结果内搜索：<input type="text">
			<div id="box4">
				<c:forEach items="${courses }" var="course">
					
					<div class="course">
						<div style="width:150px;height:150px;border:1px solid black;">
						</div>
						<div style="padding:15px;position:relative;top:-150px;left:150px;width:800px;height:150px;">
							<h4>课程名称：${course.name }</h4> 
							<h5> 
							&nbsp 科目:${course.kemu }  &nbsp 年级:${course.nianji } &nbsp 类型:${course.leixing }
							&nbsp 来源:${course.laiyuan } &nbsp 热度:${course.renqi }
							</h5>
							<h4>价格：<font color="red">￥${course.cost }</font></h4>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
</body>
</html>