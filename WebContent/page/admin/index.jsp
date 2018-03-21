<%@page import="java.text.DateFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.lkh.ht.carrental.vo.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.lkh.ht.carrental.vo.Employee"%>
<%@page import="com.lkh.ht.carrental.vo.Dept"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%Employee employee = (Employee)request.getAttribute("employee"); %>
<%List<Order> orderList = (ArrayList<Order>)request.getAttribute("orderList"); %>
<%DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT); %>
<script language="javascript">
function selectRecord(){
	var seleObj = document.getElementsByName("processId");
	for(var i=0;i<seleObj.length;i++){
		if(seleObj[i].checked){
			document.getElementById("orderId").value=seleObj[i].value;
		}
	}
}
function processAction(){
	if(validate()){
		var theForm = document.getElementById("processAction");
		theForm.action="../order/processOrder.do";
		theForm.submit();
	}else{
		alert("没有选择记录，请选择！");
	}
}
function validate(){
	if(document.getElementById("orderId").value){
		return true;
	}else{
		return false;
	}
}
</script>
</head>
<body>
<table>
	<tr>
		<td>欢迎<%=employee.getDept().getDeptName() %>的<%=employee.getUser().getShowName() %>登陆，感谢你的努力工作！</td>
	</tr>
	<tr>
		<td><button onclick="processAction();">订单管理</button></td>
	</tr>
</table>
<table bordercolor="#3e3e3e" border="1" cellpadding="0" cellspacing="0" width="100%">
		<tr>
			<td>&nbsp;</td>
			<td>订单编号</td>
			<td>下单用户</td>
			<td>下单用户电话</td>
			<td>取车方式</td>
			<td>地址</td>
			<td>车型</td>
			<td>预开始日期</td>
			<td>预结束日期</td>
			<td>预算金额</td>
			<td>取车照片</td>
			<td>还车照片</td>
			<td>订单状态</td>
		</tr>
<%if(null !=orderList){ %>
	<%for(int i=0;i<orderList.size();i++){ %>
		<%Order order = orderList.get(i);%>
		<tr>
			
			<td>
				<%if("A".equals(order.getOrderStatus()) || "B".equals(order.getOrderStatus())){ %>
				<input type="radio" name="processId" value="<%=order.getOrderId()%>" onclick="selectRecord()">
				<%} %>
			</td>
			<td><%=order.getOrderNo()%></td>
			<td><%=order.getCreateUserName()%></td>
			<td><%=order.getCreateUserPhone()%></td>
			<td>
			<%if("1".equals(order.getGetCarType())){ %>
				上门送取
			<%}else if("2".equals(order.getGetCarType())){%>
				到店取还
			<%} %>	
			</td>
			<td>
			<%if("1".equals(order.getGetCarType())){ %>
				<%=order.getAddr()%>
			<%}else if("2".equals(order.getGetCarType())){%>
				<%=employee.getDept().getDeptAddr()%>
			<%} %>
			</td>
			<td>
			<%=order.getCtName()%>
			</td>
			<td><%=dateFormat.format(order.getEstiStartDate())%></td>
			<td><%=dateFormat.format(order.getEstiEndDate())%></td>
			<td><%=(order.getEstiEndDate().getTime()-order.getEstiStartDate().getTime())/(24*60*60*1000)*order.getEstimateUnitPrice() %></td>
			<td>取车照片</td>
			<td>还车照片</td>
			<td>
			<%if("A".equals(order.getOrderStatus())){ %>
				待取车	
			<%}else if("B".equals(order.getOrderStatus())){%>
				待还车
			<%}else if("C".equals(order.getOrderStatus())){%>
				订单取消
			<%}else if("F".equals(order.getOrderStatus())){%>
				完成
			<%}%>
			</td>
		</tr>
	<%} %>
<%} %>
	</table>
	<form id="processAction" method="post">
		<input type="hidden" id="orderId" name="orderId" value="">
	</form>
</body>
</html>