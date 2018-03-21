/**
 * 初始LOGIN
 */
$(function($) {
	initPage();
});
var initPage = function(){
	var srcType = $("#srcType").val();
	if("1"==srcType){
		$("#page_title").text("上门送取");
	}else{
		$("#page_title").text("到店取还");
	}
};