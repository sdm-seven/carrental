<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>惠通租车</title>
    <meta name="viewport" content="width=device-width,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="../css/index.css"/>
<link rel="stylesheet" href="../lib/weui.min.css">
<link rel="stylesheet" href="../css/jquery-weui.css">
<link rel="stylesheet" href="../css/jquery-weui.min.css">
</head>
<body>
	<form action="/carrental/user/login.do" id="theForm" name="theForm" method="POST" >
		<div class="weui_cells weui_cells_form">
			<div class="weui_cell">
				<div class="weui_cell_hd">
					<label class="weui_label">手机号码</label>
				</div>
				<div class="weui_cell_bd weui_cell_primary">
					<input class="weui_input" name='userphone' type="number" pattern="[0-11]*"
						placeholder="请输入手机号码" />
				</div>
			</div>
			<div class="weui_cell">
				<div class="weui_cell_hd">
					<label class="weui_label">密码</label>
				</div>
				<div class="weui_cell_bd weui_cell_primary">
					<input class="weui_input" name='password' type="password" pattern="[0-11]*"
						placeholder="请输入密码" />
				</div>
			</div>
			<button id="Submit" type="submit" class="weui_btn weui_btn_primary">登录</button>
		</div>
	</form>
	<script src="../lib/jquery-2.1.4.js"></script>
	<script src="../lib/fastclick.js"></script>
	<script src="../js/login.js"></script>
</body>
</html>