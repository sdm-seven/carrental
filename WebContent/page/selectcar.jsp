<%@page import="com.lkh.ht.carrental.vo.CarModels"%>
<%@page import="com.lkh.ht.carrental.vo.Order"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>惠通租车</title>
<meta name="viewport"
	content="width=device-width,initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css"
	href="../css/zcbase-0ef91f71fb.css">
<link rel="stylesheet" type="text/css"
	href="../css/zcorder-6d44000c54.css">
<script type="text/javascript" src="../js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="../js/jquery-weui.js"></script>
<script type="text/javascript" src="../js/sc.js"></script>
<%
	Order order = (Order) request.getAttribute("order");
%>
<script type="text/javascript">
function toSubmit(obj){
	//var trObj = obj.parentNote;
	//alert(obj.parentNote)
	document.getElementById("theForm").submit();
	 
}
</script>
</head>
<body>
	<form id="theForm" name="theForm" action="createOrder.do" method="post">
		<table width="100%">
			<%
				for (int i = 0; i < order.getCarModelList().size(); i++) {
			%>
			<%
				CarModels carModel = order.getCarModelList().get(i);
			%>
			<tr cm1="<%=carModel.getCtId()%>" cm2="<%=order.getGetCarType()%>"
				cm3="<%=order.getAddr()%>" cm4="<%=order.getEstiStartDate()%>"
				cm5="<%=order.getEstiEndDate()%>"
				cm6="<%=order.getEstimateUnitPrice()%>">
				<td rowspan="2"><img alt="" src="<%=carModel.getCtImgURL()%>"></td>
				<td colspan="2"><%=carModel.getCtName()%></td>
				<td rowspan="2"><input type="button" onclick="toSubmit(this)" value="下单">
				
				</td>
			</tr>
			<tr>
				<td><%=carModel.getCtDesc()%></td>
				<td><%=carModel.getEstimateUnitPrice()%></td>
			</tr>
			<hr>
			<%
				}
			%>
		</table>
		<input type="hidden" name="ctId" />
		<input type="hidden" name="getCarType" />
		<input type="hidden" name="addr" />
		<input type="hidden" name="estiStartDate" />
		<input type="hidden" name="estiEndDate" />
		<input type="hidden" name="estimateUnitPrice" />
		<input type="hidden" name="CtName" />
	</form>
</body>
</html>