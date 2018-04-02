<%--
  Created by IntelliJ IDEA.
  User: GAO
  Date: 2018/1/7
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<html>
<head>
    <div class="l_nav2">
        <div class="ta1">
            <strong>个人中心</strong>
            <div class="leftbgbt">
            </div>
        </div>
        <div class="cdlist">
            <div>
                <a href="${pageContext.request.contextPath}/myInfo">我的信息</a>
            </div>

            <div>
                <a href="${pageContext.request.contextPath}/MyAppeal/myAppeal">我的异议</a></div>
        </div>
        <div class="ta1">
            <strong>教务中心</strong>
            <div class="leftbgbt2">
            </div>
        </div>
        <div class="cdlist">
            <div>
                <a href="${pageContext.request.contextPath}/MyCourseController/toMyCourse">我的课程</a></div>
            <div>
                <a href="${pageContext.request.contextPath}/MyCourseController/toMyCourseTest">我的报考</a></div>
            <div>
                <a href="${pageContext.request.contextPath}/MyCourseController/toMyScore">我的成绩</a></div>
            <div>
                <a href="${pageContext.request.contextPath}/ChooseCourseController/chooseCourse">我要选课</a></div>
        </div>


    </div>
</head>
<body>

</body>
</html>
