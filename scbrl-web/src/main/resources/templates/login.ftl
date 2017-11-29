
<!DOCTYPE html>
<html>

<!-- Head -->
<head>

    <title>Saas Cloud - Login</title>

    <!-- Meta-Tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">

    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //Meta-Tags -->

    <!-- Style -->
    <link rel="stylesheet" href="${request.contextPath}static/css/login_style.css" type="text/css" media="all">
    <script type="text/javascript" src="${request.contextPath}static/js/jquery-3.0.0.js"></script>
    <script type="text/javascript" src="${request.contextPath}static/admin/layui/layui.all.js"></script>
    <script language="javascript">
        if(self!=top){top.location.href=self.location.href;}
    </script>

</head>
<!-- //Head -->

<!-- Body -->
<body>
<form id="loginForm" name="loginForm" action="/main" method="post">
<div class="container w3layouts agileits" style="margin-top:10%;">

    <div class="login w3layouts agileits">
        <h2>云平台 - 登录</h2>

            <input type="text" id="username" Name="username" placeholder="用户名" required="">
            <input type="password" id="password" Name="password" placeholder="密码" required="">

        <ul class="tick w3layouts agileits">
            <li>
                <input type="checkbox" id="brand1" value="">
                <label for="brand1"><span></span>记住我</label>
            </li>
        </ul>
        <div class="send-button w3layouts agileits">
                <input type="submit" id="subbut" onclick="fnLogin();" value="登 录">
        </div>

        <div class="clear"></div>
    </div>


    <div class="clear"></div>

</div>

</form>
<script >

    $(document).ready(function(){
        if("${ErrorLoginMsg!}"!=""  ){
            layer.msg("${ErrorLoginMsg!}",{icon: 2});
        }
    });

    function fnLogin(){
        $("#subbut").attr("disabled",true);
        layer.msg("登录验证中...");
        $("#loginForm").submit();
    }

</script>
</body>
<!-- //Body -->


</html>