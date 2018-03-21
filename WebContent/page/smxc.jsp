<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>惠通租车</title>
    <meta name="viewport" content="width=device-width,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="../css/zcbase-0ef91f71fb.css">
    <link rel="stylesheet" type="text/css" href="../css/zcorder-6d44000c54.css">
    <style type="text/css">
    .rentpage .dztime p.dd {
    color: #424242;
    font-size: 16px;
    line-height: 28px;
    }
    </style>
    <script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="../js/jquery-weui.js"></script>
    <script type="text/javascript" src="../js/sc.js"></script>
</head>
<body>
<form action="selectcar.do" method="POST">
<input type="hidden" id="srcType" name="srcType" value="<%=request.getParameter("srcType")%>">
    <header class="zc_header_bd">
    <h1 class="header_title" id="page_title">上门送取</h1>
</header>
    <div class="hotel-page-pt50 rentpage">
        <div class="mainbox">
            <ul class="dzul mt10">
                <li class="dztext dzcheng">取车城市</li>
                <li class="dzcity dzcheng" id="fcnbox" data-type="rentCity" data-url="/html5/newversion/rent/rentcity.html">
                    武汉 <i class="grayarrowr dzcheng" id="rentCity"></i></li>
            </ul>
            <div class="dzulbox">
                <ul class="dzulin qcmdul">
                    <li class="dztext dzcheng defsmqc" style="display: list-item;">送车地址</li>
                    <li class="dztext dzcheng defsmqc" >
                        <input id="sendAddress" name="sendAddress" style="color: #2f2f39" type="text" placeholder="请选择送车地址">
                    </li>
                </ul>
            </div>
            <div class="dztime brbotda">
                <div class="fl w30" data-type="rentTime" id="rentTime" data-url="/html5/newversion/rent/rentdate.html">
                    <p class="title">
                        取车时间</p>
                    <p class="dd" id="rentDate-time" style="text-align:center;">
                        <input type="text" style="width:80px;" name="esd" onblur="getDays()" value="2017-1-11"></p>
                    <p class="day" id="rentDate-month-day-week"><!-- 星期一 --></p>
                </div>
                <div class="fl w40">
                    <div class="">
                        <p id="rentPeriod"> </p>
                        <p class="tian"> </p>  
                    </div>
                </div>
                <div class="fl w30" data-type="returnTime" id="returnTime" data-url="/html5/newversion/rent/returndate.html">
                    <p class="title">
                        还车时间</p>
                    <p class="dd" id="returnDate-time" style="text-align:center;">
                        <input type="date" style="width:80px;"  name="eed" onblur="getDays()" value="2017-1-12"></p>
                    <p class="day" id="returnDate-month-day-week"><!-- 星期二 --></p>
                </div>
            </div>
            <p class="ar pr10 noenjoytip" style="display: none;">
            </p>
        </div>
        <div class="hd-tipnew" style="">
            <div class="hd-flex">
                <p class="tips">
                    部分城市指定区域，免费上门送取车！</p>
            </div>
        </div>
        <div class="fixbot" id="selectCar">
            <button type="submit" class="btn-ordernow">立即去选车</button>
        </div>
    </div>
    </form>
</body>
</html>
