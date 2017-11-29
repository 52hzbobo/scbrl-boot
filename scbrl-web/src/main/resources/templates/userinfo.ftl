<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>个人中心</title>
    <!-- 引入公共脚步及样式 -->
    <#include "system/syscommon.ftl">
    <link title="" href="static/admin/css/style.css" rel="stylesheet" type="text/css"  />
    <link title="" href="static/admin/css/templatecss.css" rel="stylesheet" type="text/css"  />
</head>

<body>

<div class="view-product">
    <div class="container-fluid">
        <div class="manage account-manage info-center">
            <div class="page-header">
                <div class="pull-left">
                    <h4>账号管理</h4>
                </div>
            </div>
            <dl class="account-basic clearfix">
                <dt class="pull-left">
                <p class="account-head">
                    <img src="static/admin/img/bruceliu@2x.png">
                </p>
                </dt>
                <dd class="pull-left margin-large-left margin-small-top">
                    <p class="text-small">
                        <span class="show pull-left base-name">会员账号</span>:<span class="margin-left">Bruce.Liu </span>
                    </p>
                    <p class="text-small">
                        <span class="show pull-left base-name">认证状态</span>:
                        <span class="margin-left" style="color: #008b00; ">已认证</span>
                        <!-- <a class="margin-left text-main text-underline" href="#">立即认证</a> -->
                    </p>
                    <p class="text-small">
                        <span class="show pull-left base-name">注册时间</span>:<span class="margin-left">2017-08-26 16:50:22</span>
                    </p>
                </dd>
            </dl>
            <div class="account-basic clearfix">
                <span class="pull-left show text-small">您当前的账号安全程度</span>
                <div class="progress-bar pull-left margin-large-left margin-large-35">
                    <div style="background: rgb(255, 153, 0) none repeat scroll 0% 0%; width: 180px;" data-width="100">
                    </div>
                </div>
                <span class="pull-left show text-small">安全级别: <span style="color: rgb(255, 153, 0);" class="leval-safe">高</span></span>
            </div>
            <ul class="accound-bund">
                <li class="clearfix">
                    <span class="bund-class">登录密码</span>
                    <span class="w45">安全性高的密码可以使账号更安全，建议您定期更换密码，设置一个包含字母，符号或数字中至少两项且长度超过6位的密码。</span>
						<span class="pull-right margin-large-right">
						<i class="glyphicon glyphicon-ok-circle pull-left"></i>
						<em class="margin-right text-green-deep">已设置</em>
						            		|
						<a href="#" data-panel="modify_pass" data-title="修改密码-修改密码" data-callback="$(&quot;#modify_pass&quot;).submit();" data-btn="下一步,取消" class="button-word1 margin-left btn_ajax_open">修改</a>
						<input data-panel="modify_pass2" data-title="修改密码-修改完成" data-btn="完成" data-callback="layer.closeAll();" class="modify_pass_setup2 btn_ajax_open" value="第三步" type="hidden">
						</span>
                </li>

                <li class="clearfix">
                    <span class="bund-class">邮箱绑定</span>
                    <span class="w45">绑定邮箱可以用于安全验证、找回密码等重要操作</span>
						<span class="pull-right margin-large-right">
						<i class="glyphicon glyphicon-ok-circle pull-left"></i>
						<em class="margin-right text-green-deep">已设置</em>
						            					            		|
						<a href="#" data-panel="modify-email-revise" data-title="修改绑定邮箱-邮箱验证" data-btn="发送验证到邮箱,取消" data-callback="$(&quot;#modify_email&quot;).submit();" class="button-word1 margin-left btn_ajax_open">修改</a>
						<input data-panel="modify-email-revise2" data-title="修改绑定邮箱-修改成功" data-btn="完成" data-callback="layer.closeAll();" class="modif_email_setup2 btn_ajax_open" type="hidden">
						</span>
                </li>

                <li class="clearfix border-bottom-none">
                    <span class="bund-class">邀请链接</span>
                    <span class="w45" id="fe_text">http://www.mycodes.net</span>
						<span class="pull-right margin-large-right">
						<a class="button-word1 margin-left" id="copy_button" data-clipboard-target="fe_text" href="#">复制链接</a>
						</span>
                </li>
            </ul>
        </div>
    </div>
</div>
<script type="text/javascript">

</script>
</body>
</html>
