<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
    <title>首页</title>
    <!-- 引入公共脚步及样式 -->
    <#include "system/syscommon.ftl">
    <link title="" href="static/admin/css/style.css" rel="stylesheet" type="text/css"  />
    <style type="">
        html , body {height: 100%;}
    </style>
</head>

<body >

    <div class="my-index " style="height: 100%" >
        <div class="container-fluid">
            <div class="info-center">

                <!---title----->
                <div class="info-title">
                    <div class="pull-left">
                        <h4><strong>Hello , Bruce.Liu </strong></h4>
                        <p>欢迎登录管理系统！ <a href="#" target="_blank"></a></p>
                    </div>
                    <div class="time-title pull-right">
                        <div class="year-month pull-left">
                            <p>星期二</p>
                            <p><span>2016</span>年8月23日</p>
                        </div>
                        <div class="hour-minute pull-right">
                            <strong>9:00</strong>
                        </div>
                    </div>
                    <div class="clearfix"></div>
                </div>
                <!----content-list---->
                <div class="content-list">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="content">
                                <div class="w30 left-icon pull-left">
                                    <span class="glyphicon glyphicon-file blue"></span>
                                </div>
                                <div class="w70 right-title pull-right">
                                    <div class="title-content">
                                        <p>待办事项</p>
                                        <h3 class="number">90</h3>
                                        <button class="btn btn-default">待我处理<span style="color:red;">12</span></button>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="content">
                                <div class="w30 left-icon pull-left">
                                    <span class="glyphicon glyphicon-file violet"></span>
                                </div>
                                <div class="w70 right-title pull-right">
                                    <div class="title-content">
                                        <p>待办事项</p>
                                        <h3 class="number">90</h3>
                                        <button class="btn btn-default">待我处理<span style="color:red;">12</span></button>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="content">
                                <div class="w30 left-icon pull-left">
                                    <span class="glyphicon glyphicon-file orange"></span>
                                </div>
                                <div class="w70 right-title pull-right">
                                    <div class="title-content">
                                        <p>待办事项</p>
                                        <h3 class="number">90</h3>
                                        <button class="btn btn-default">待我处理<span style="color:red;">12</span></button>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="content">
                                <div class="w30 left-icon pull-left">
                                    <span class="glyphicon glyphicon-file green"></span>
                                </div>
                                <div class="w70 right-title pull-right">
                                    <div class="title-content">
                                        <p>待办事项</p>
                                        <h3 class="number">90</h3>
                                        <button class="btn btn-default">待我处理<span style="color:red;">12</span></button>
                                    </div>
                                </div>
                                <div class="clearfix"></div>
                            </div>
                        </div>
                    </div>
                    <!-------信息列表------->
                    <div class="row newslist" style="margin-top:20px;">
                        <div class="col-md-8">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    我的事务<div class="caret"></div>
                                    <a href="#" class="pull-right"><span class="glyphicon glyphicon-refresh"></span></a>
                                </div>
                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span class="text-green-main">处理中</span></div>
                                </div>

                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span class="text-green-main">处理中</span></div>
                                </div>

                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span class="text-gray">已关闭</span></div>
                                </div>

                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span>处理中</span></div>
                                </div>
                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span>处理中</span></div>
                                </div>
                                <div class="panel-body">
                                    <div class="w15 pull-left">
                                        <img src="static/admin/img/noavatar_middle.gif" width="25" height="25" alt="图片" class="img-circle">
                                        安妮
                                    </div>
                                    <div class="w55 pull-left">系统需要升级</div>
                                    <div class="w20 pull-left text-center">2016年8月23日</div>
                                    <div class="w10 pull-left text-center"><span>处理中</span></div>
                                </div>

                                <div class="panel-body text-center">
                                    <a href="#" style="color:#5297d6;">查看全部</a>
                                </div>

                            </div>
                        </div>

                        <div class="col-md-4">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    我的事务统计
                                    <a href="#" class="pull-right"><span class="glyphicon glyphicon-refresh"></span></a>
                                </div>
                                <div class="panel-body">

                                </div>
                            </div>

                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
<script type="text/javascript">

</script>
</body>
</html>
