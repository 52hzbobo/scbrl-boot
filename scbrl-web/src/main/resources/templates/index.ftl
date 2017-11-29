<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title> Hello World </title>
    <link href="${request.contextPath}/static/css/index.css" rel="stylesheet" type="text/css"/>
    <style>

    </style>
</head>
<body>
<h1 >${msg}</h1>
<div class="ball-box">
    <div class="ball">
        <div class="line-1 "></div>
        <div class="line-2 "></div>
        <div class="line-3 "></div>
        <div class="line-4 "></div>
        <div class="line-5 "></div>
        <%--<div class="line-X-1 "></div>--%>
    </div>
</div>
<h4 class="className animated" id="tm_ymdhi" ></h4>
</body>
<script>

    window.onload = function (){
        document.getElementById("tm_ymdhi").innerHTML = CurentTime();
    };
    function CurentTime() {
        var now = new Date();
        var year = now.getFullYear();       //骞?
        var month = now.getMonth() + 1;     //鏈?
        var day = now.getDate();            //鏃?
        var hh = now.getHours();            //鏃?
        var mm = now.getMinutes();          //鍒?
        var clock = year + "-";
        if(month < 10)
            clock += "0";
        clock += month + "-";
        if(day < 10)
            clock += "0";
        clock += day + " ";
        if(hh < 10)
            clock += "0";
        clock += hh + ":";
        if (mm < 10) clock += '0';
        clock += mm;
        return(clock);
    }
</script>
</html>