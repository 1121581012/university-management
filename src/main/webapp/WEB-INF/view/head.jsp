<%--
  Created by IntelliJ IDEA.
  User: GAO
  Date: 2018/1/7
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script type="text/javascript">
        var webroot = '<%=request.getContextPath()%>/';
    </script>
    <link href="${pageContext.request.contextPath}/Style/StudentStyle.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/Script/jBox/Skins/Blue/jbox.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/Style/ks.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/Script/jBox/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/jBox/jquery.jBox-2.3.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/jBox/i18n/jquery.jBox-zh-CN.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/Common.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/Data.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/changeOption.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/rl.js" type="text/javascript"></script>
</head>
<body>
<div class="banner">
    <div class="bgh">
        <div class="page">
            <div id="logo">
                <a href="#">
                    <img src="${pageContext.request.contextPath}/images/Student/logo.jpg" alt="" width="165" height="48" />
                </a>
            </div>
            <div class="topxx">
                ${sessionScope.id}学员：${sessionScope.name}，欢迎您！
                <a href="#">我的信息</a>
                <a href="#">通知</a>
                <a href="#">密码修改</a>
                <a onclick="loginOut()" href="javascript:">安全退出</a>
            </div>
            <div class="blog_nav">
                <ul>
                    <li><a href="${pageContext.request.contextPath}/myInfo">个人中心</a></li>
                    <li><a href="#">教务中心</a></li>

                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
