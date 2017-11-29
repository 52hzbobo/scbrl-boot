<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title> Saas 云管理平台 - ${UserInfo.nickName!} </title>
<!-- 引入公共脚步及样式 -->
<#include "syscommon.ftl">
</head>

<body>
<!-- 头部页面 -->
<#include "top.ftl">
<div class="down-main">
  <!-- 左侧菜单 -->
  <#include "left.ftl">
  <!-- 右侧功能区 -->
  <div class="right-product right-full">
      <iframe name="mainFrame" id="mainFrame" frameborder="0" src="/home" style="margin:0 auto;width:100%;height:100%;"></iframe>
  </div>
</div>
<script type="text/javascript">
$(function(){
	/*左侧导航栏显示隐藏功能*/
	$(".subNav").click(function(){
			/*显示*/
			if($(this).find("span:first-child").attr('class')=="title-icon glyphicon glyphicon-chevron-down")
			{
				$(this).find("span:first-child").removeClass("glyphicon-chevron-down");
                $(this).find("span:first-child").addClass("glyphicon-chevron-up");
                $(this).removeClass("sublist-down");
                $(this).addClass("sublist-up");
			}
			/*隐藏*/
			else
			{
				$(this).find("span:first-child").removeClass("glyphicon-chevron-up");
				$(this).find("span:first-child").addClass("glyphicon-chevron-down");
				$(this).removeClass("sublist-up");
				$(this).addClass("sublist-down");
			}	
		// 修改数字控制速度， slideUp(500)控制卷起速度
	    $(this).next(".navContent").slideToggle(300).siblings(".navContent").slideUp(300);
	})

	/*左侧导航栏缩进功能*/
	$(".left-main .sidebar-fold").click(function(){

		if($(this).parent().attr('class')=="left-main left-full")
		{
			$(this).parent().removeClass("left-full");
			$(this).parent().addClass("left-off");

			$(this).parent().parent().find(".right-product").removeClass("right-full");
			$(this).parent().parent().find(".right-product").addClass("right-off");

			}
		else
		{
			$(this).parent().removeClass("left-off");
			$(this).parent().addClass("left-full");

			$(this).parent().parent().find(".right-product").removeClass("right-off");
			$(this).parent().parent().find(".right-product").addClass("right-full");

			}
		})

	  /*左侧鼠标移入提示功能*/
	  $(".sBox ul li").mouseenter(function(){
			if($(this).find("span:last-child").css("display")=="none")
			{$(this).find("div").show();}
			}).mouseleave(function(){$(this).find("div").hide();})
      })

      function mainMenu(url) {
			$("#mainFrame").attr("src",url);
	  }
</script>
</body>
</html>
