<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body>
<div class="left-main left-full">
    <div class="sidebar-fold"><span class="glyphicon glyphicon-menu-hamburger"></span></div>
    <div class="subNavBox">
        <#list Menus as mp>
            <div class="sBox">
                <div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">${mp["menuName"]}</span>
                </div>
                <ul class="navContent" style="display:block">
                    <#list mp["menuSubs"] as ms >
                    <li >
                        <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />${ms["menuName"]}</div>
                        <a href="#" onclick="mainMenu('/${ms["menuUrl"]}')"><span class="${ms["menuIcon"]}"></span><span class="sub-title">${ms["menuName"]}</span></a>
                    </li>
                    </#list>
                </ul>
            </div>
        </#list>
        <!--
        <div class="sBox">
            <div class="subNav sublist-down"><span class="title-icon glyphicon glyphicon-chevron-down"></span><span class="sublist-title">管理中心</span>
            </div>
            <ul class="navContent" style="display:none">
                <li >
                    <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />账号管理</div>
                    <a href="#" onclick="mainMenu('/userinfo')"><span class="sublist-icon glyphicon glyphicon-user"></span><span class="sub-title">账号管理</span></a> </li>
                <li>
                    <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />消息中心</div>
                    <a href="#" onclick="mainMenu('/message')"><span class="sublist-icon glyphicon glyphicon-envelope"></span><span class="sub-title">消息中心</span></a> </li>
                <li>
                    <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />短信</div>
                    <a href="#" onclick="mainMenu('/smsinfo')"><span class="sublist-icon glyphicon glyphicon-bullhorn"></span><span class="sub-title">短信</span></a></li>
                <li>
                    <div class="showtitle" style="width:100px;"><img src="img/leftimg.png" />实名认证</div>
                    <a href="#" onclick="mainMenu('/identify')"><span class="sublist-icon glyphicon glyphicon-credit-card"></span><span class="sub-title">实名认证</span></a></li>
            </ul>
        </div>
        -->

    </div>
</div>

</body>
</html>
