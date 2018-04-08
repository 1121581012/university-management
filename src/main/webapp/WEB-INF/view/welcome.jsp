<%--
  Created by IntelliJ IDEA.
  User: GAO
  Date: 2017/12/28
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<html >
<head>
    <title>高校管理系统</title>

</head>
<body>



<jsp:include page="head.jsp"></jsp:include>
<div class="page">
    <div class="box mtop">
        <div class="leftbox">
            <jsp:include page="leftbody.jsp"></jsp:include>
        </div>
        <div style="text-align:center;" class="rightbox">

            <div class="xxlc">
                <strong >欢迎登录</strong>
            </div>
                <h2 style="color: Red; font-weight:bold; text-align:center;">${sessionScope.name}同学,请根据左侧导航栏进行相应操作!</h2>
        </div>
    </div>
    <div class="footer">
        <p>
            &copy;copyright 2012 广博教育 csgb.net 版权所有 </p>
    </div>
</div>
<div style="text-align:center;">

</div>
</body>
</html>
