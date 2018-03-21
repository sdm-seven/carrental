/**
 * 初始LOGIN
 */
$(function($) {
	$("#Submit").bind('click',function(){
		debugger
		$("#theForm").action='/carrental/user/login.do';
		$("#theForm").method='POST';
		$("#theForm").submit();
//		$.ajax({  
//			type: "POST",  
//			data:$("#theForm").serialize(),  
//			url: "/carrental/user/login.do",  
//			dataType: "text",  
//			cache: false,  
//			success: function(v){
//				debugger    
//				if(null==v){  
//					return;  
//				}else{  
//					location.reload();   
//				}  
//			}  
//		}); 
	})
	
});