<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="http://how2j.cn/study/jquery.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息</title>
</head>
<script type="text/javascript">
	$(function(){
		$("#box1").animate({left:'50px'},500);
		$("#box2").animate({top:'-500px'},500);
		$("#button1").click(function(){
			$("#box2").fadeIn(500);
			$("#box3").fadeOut(500);
			$(".gengai").fadeToggle(500);
		});
		$("#button2").click(function(){
			$("#box3").fadeIn(500);
			$("#box2").fadeOut(500);
		});
	})
</script>
<script>
function handleFiles(obj,id) {
    file = document.getElementById("icon");
    var files = obj.files;
    img = new Image();
    if(window.URL){
        //File API
        img.src = window.URL.createObjectURL(files[0]); //创建一个object URL，并不是你的本地路径
        img.onload = function(e) {
        window.URL.revokeObjectURL(this.src); //图片加载后，释放object URL
        }
    }
    file.src=img.src;
    //上传文件
        var fd = new FormData(),//实例化一个表单
        xhr = new XMLHttpRequest();
        fd.append('headimg', files[0]);//追加图片元素
        xhr.open('post', 'user.php?act=act_edit_img');//请求方式，请求地址
        xhr.send(fd);
}
</script>
<style>
	.gengai{
		display:none;
	}
	#box1{
		position:relative;
		width:300px;
		height:500px;
		margin-top:80px;
		left:50%;
		border:1px black solid;
	}
	#box2{
		position:relative;
		top:-750px;
		height:500px;
		width:400px;
	}
	#box3{
	position:absolute;
		top:70px;
		left:280px;
		height:500px;
		width:800px;
		display:none;
	}
	#touxiang{
		margin-top:20px;
		width:150px;
		height:150px;
		border:1px black solid;
	}
	.botton{
		margin-top:20px;
	}
</style>
<body>
	<jsp:include page="DaoHangLan.jsp" flush="true"/>
	<div id="box1">
		<center>
			<div id="touxiang">
				
			</div>
			<h4><font size="2">Name:</font>${user.name }</h4>
			<button class="botton" id="button1">更改信息</button><br>
			<button class="botton">我的课程</button><br>
			<button class="botton">我的收藏</button><br>
			<button class="botton" id="button2">我的视频</button><br>
			<button class="botton">问题反馈</button><br>
			
		</center>
	</div>
	<center>
	<div id="box2">
	<form action="update?mail=${user.mail }" method="post">
		<h4><font size="2">Name（昵称）:</font>${user.name }<font class="gengai" size="2">  <input type="text" name="nichen" value=${user.name }></font></h4><br>
		<h4><font size="2">姓名:</font>${user.xingming }<font class="gengai" size="2">  <input type="text" name="xingming" value=${user.xingming }></font></h4><br>
		<h4><font size="2">性别:</font>${user.xingbie }<font class="gengai" size="2">  <input type="radio" name="xingbie" value="男" checked="checked">男 <input type="radio" name="xingbie" value="女" >女</font></h4><br>
		<h4><font size="2">年级:</font>${user.nianji }<font class="gengai" size="2">  <input type="text" name="nianji" value=${user.nianji }></font></h4><br>
		<h4><font size="2">身份:</font>${user.shenfen }</h4><br>
		<h4><font size="2">QQ:</font>${user.qq }<font class="gengai" size="2">  <input type="text" name="qq" value=${user.qq }></font></h4><br>
		<h4><font size="2">邮箱:</font>${user.mail }</h4><br>
		<h4><font size="2">手机:</font>${user.phone }<font class="gengai" size="2">  <input type="text" name="shouji" value=${user.phone }></font></h4>
		<button class="gengai" type="submit">提交</button>
	</form>
	</div>
	</center>
	<div id="box3">
		<form>
			<div style="position:relative;margin:20px 350px;left:-250px;">
				<button tyle="submit">确定上传</button>
			</div>
			<div style="position:relative;margin:20px 350px;left:-250px;width:700px;border:1px black solid;height:400px;">
				<div style="position:relative;margin:20px;">
					名称：<input type="text">
				</div>
				<div style="position:relative;margin:20px;width:500px;height:240px;">
					简介：<br><textarea rows="10" cols="80"></textarea>
				</div>
				<div style="margin-left:20px;">
				<button tyle="submit">选择上传视频</button>
				</div>
			</div>
		</form>
	</div>
	
	
</body>
</html>