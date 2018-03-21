/**
 * 初始LOGIN
 */
$(function($) {
  $('#index_dzzj').live('click',function(){
	  if(''==$("#userId").val()){
		  location.href='/carrental/user/intiLogin.do';
	  }else{
		  location.href='/carrental/order/initOrder.do?srcType=1';
	  }
	  
  });
  $('#index_szzc').live('click',function(){
	  if(''==$("#userId").val()){
		  location.href='/carrental/user/intiLogin.do';
	  }else{
		  location.href='/carrental/order/initOrder.do?srcType=2';
	  }
  });
  $('#index_md').live('click',function(){
	  alert('正在維護')
  });
  $('#index_wd').live('click',function(){
	  alert('正在維護')
  });
});