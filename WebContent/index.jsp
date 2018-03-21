<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>惠通租车</title>
    <meta name="viewport" content="width=device-width,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" href="css/index.css"/>
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="js/jquery-weui.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<input type="hidden" id="userId" name="userId" />
<input type="hidden" id="showName" name="showName"  />
<input type="hidden" id="roleId" name="roleId"  />
<input type="hidden" id="userName" name="userName" />
<input type="hidden" id="userPhone" name="userPhone"  />
    <header>
	    <i class="telephone"><a href="tel:88888888"></a></i>
    </header>
    <div class="container">
        <div id="slides" style="overflow: hidden; display: block;">
                        <img src="img/20161214chunjie_wap.jpg"
                            style="width: 400px; height: 200px;">
        </div>
    </div>
    <nav>
	<ul id="navbox">
		<li class="nav_item_l h107">
			<i class="ind wh40" id="index_dzzj"></i>
			<p>上门送取</p>
		</li>
		<li class="nav_item h107">
			<i class="ind wh40" id="index_szzc"></i>
			<p>到店取还</p>
		</li>
		<li class="nav_item_l">
			<i class="ind" id="index_md"></i>
			<p>查门店</p>
		</li>
		<li class="nav_item">
			<i class="ind" id="index_wd"></i>
			<p>我的</p>
		</li>
	</ul>
</nav>

    <div class="clear">
    </div>
    <div class="bh-footer">
        <p class="tel">
            <a href="tel:4006166666"><span class="__conttel__" style="user-select: none; -webkit-user-select: none">
                400-88888888</span></a></p>

        <p class="copyright">
            Copyright&ensp;©2017&ensp;惠通租车</p>
    </div>
</body>
</html>