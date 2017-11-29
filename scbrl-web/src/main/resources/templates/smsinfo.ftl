<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>短信管理</title>
    <!-- 引入公共脚步及样式 -->
    <#include "system/syscommon.ftl">
    <link title="" href="static/admin/css/style.css" rel="stylesheet" type="text/css"  />
    <link title="" href="static/admin/css/templatecss.css" rel="stylesheet" type="text/css"  />
</head>

<body>
<div class="container-fluid">

    <div class="message-manage info-center">
        <div class="page-header">
            <div class="pull-left">
                <h4>短信</h4>
            </div>
        </div>
        <div class="manage-detail">
            <h6 class="h5">某某的短信平台只需站点后台绑定账号并开启即可使用，多个站点均可通用短信余额</h6>
            <div class="margin-tb manage-detail-con clearfix">
                <span class="h5 pull-left">短信剩余：<em class="h2">0 </em>条</span>
                <a class="h5 recharge pull-left" href="#">充值</a>
                <a class="h5 margin-large-left custom pull-left" href="#">自定义短信</a>
            </div>
        </div>
        <div class="manage-record">
            <h6 class="margin-big-top">
                <span class="pull-left manage-title border-bottom-main">发送记录</span>
						<span class="pull-right record-fond">
						<div class="select-table pull-right">
                            <div>
                                <input readonly="readonly" value="全部站点" type="text">
								<span>
								<img src="statics/console/images/icon_lit1.png" width="10">
								</span>
                            </div>
                        </div>
						<span class="pull-right margin-small-top">按站点查找：</span>
						</span>

            </h6>
            <div class="clearfix"></div>
            <div class="table-margin">
                <table class="table table-bordered table-header">
                    <thead>
                    <tr>
                        <td class="w60">发送内容</td>
                        <td class="w10">发送时间</td>
                        <td class="w10">使用站点</td>
                        <td class="w10">条数</td>
                        <td class="w10">状态</td>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                        <td>2</td>
                    </tr>
                    </tbody>
                </table>
            </div>

        </div>
    </div>
    <div class="clearfix"></div>
    <div class="show-page padding-big-right hidden">
        <div class="page">
        </div>
    </div>


</div>
<script type="text/javascript">

</script>
</body>
</html>
