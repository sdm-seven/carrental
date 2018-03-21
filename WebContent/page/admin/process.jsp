<%@page import="com.lkh.ht.carrental.vo.Car"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lkh.ht.carrental.vo.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.lkh.ht.carrental.vo.Employee"%>
<%@page import="com.lkh.ht.carrental.vo.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	Order order = (Order) request.getAttribute("order");
%>
<%
	DateFormat dateFormat = DateFormat
			.getDateInstance(DateFormat.DEFAULT);
%>
</head>
<body>
	<fieldset>
		<legend>订单信息</legend>
		<table width="100%">
			<tr>
				<td width="100">订单号：</td>
				<td width="200"><%=order.getOrderNo()%></td>
				<td width="100">创建人：</td>
				<td width="200"><%=order.getCreateUserName()%></td>
			</tr>
			<tr>
				<td>取车方式：</td>
				<td>
					<%
						if ("1".equals(order.getGetCarType())) {
					%> 上门送取 <%
						} else if ("2".equals(order.getGetCarType())) {
					%> 到店取还 <%
						}
					%>
				</td>
				<td>预租时间：</td>
				<td><%=dateFormat.format(order.getEstiStartDate())%> 至 <%=dateFormat.format(order.getEstiEndDate())%></td>
			</tr>
			<tr>
				<td width="100">车型：</td>
				<td colspan="3">
					<dir>
						<ul>
							<li><img src="<%=order.getCtImgURL()%>" alt="<%=order.getCtDesc()%>"></li>
							<li><%=order.getCtName()%></li>
							<li><%=order.getCtDesc()%></li>
						</ul>

					</dir>
				</td>
			</tr>
			<tr>
				<td>预估总价：</td>
				<td><%=(order.getEstiEndDate().getTime() - order
					.getEstiStartDate().getTime())
					/ (24 * 60 * 60 * 1000)
					* order.getEstimateUnitPrice()%></td>
				<td>预租时间：</td>
				<td><%=dateFormat.format(order.getEstiStartDate())%> 至 <%=dateFormat.format(order.getEstiEndDate())%></td>
			</tr>
		</table>
	</fieldset>
	<fieldset>
		<legend>处理订单</legend>
		<form id="theForm" action="process.do" method="post">
		<input type="hidden" id="orderId" name="orderId" value="<%=order.getOrderId()%>" />
			<table width="100%">
				<tr>
					<%if("A".equals(order.getOrderStatus())){%>
					<td align="right" width="140">实际出车时间：</td>
					<td width="200"><input type="date" id="actualStartDate" name="actualStartDate" value="<%=dateFormat.format(order.getActualStartDate())%>"/></td>
					<td align="right">选择车牌：</td>
					<td>
						<select id="carId" name="carId">
						<% for (int i = 0; i < order.getCarList().size(); i++) {%>
							<% Car car = order.getCarList().get(i); %>
							<option value="<%=car.getCarId()%>"><%=car.getPlateNumber()%></option>
						<% }%>
						</select>
					</td>
					<%}else if("B".equals(order.getOrderStatus())){ %>	
					<td align="right" width="140">实际收车时间：</td>
					<td width="200"><input type="date" id="actualEndDate" name="actualEndDate" value="<%=dateFormat.format(order.getActualEndDate())%>"/></td>
					<%} %>
				</tr>
				<tr>
					<td><%if("A".equals(order.getOrderStatus())){%>
						<input type="radio" name="orderStatus" value="B">发车<input type="radio" name="orderStatus" value="C">取消
						<%}else if("B".equals(order.getOrderStatus())){ %>	
						<input type="hidden" name="orderStatus" value="F">
						<%}%>
					</td>
					<td colspan="4" align="center"><button type="submit">处理</button></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>