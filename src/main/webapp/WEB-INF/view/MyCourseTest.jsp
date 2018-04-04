<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title>
    学生信息管理平台
</title>
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
    <script src="${pageContext.request.contextPath}/MyJs/MyCourseTest.js" type="text/javascript"></script>
    <link href="${pageContext.request.contextPath}/Style/StudentStyle.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/Script/Base.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div class="page">
    <div class="box mtop">
        <div class="leftbox">
            <jsp:include page="leftbody.jsp"></jsp:include>
        </div>
        <div class="rightbox">

            <h2 class="mbx">
                教务中心 &gt; 我的报考</h2>
            <div class="morebt">
                <ul>
                    <li><a class="tab2" href="${pageContext.request.contextPath}/MyCourseController/toMyCourse">我的课程</a></li>
                    <li><a class="tab1" href="${pageContext.request.contextPath}/MyCourseController/toMyCourseTest">我的报考</a></li>
                    <li><a class="tab2" href="${pageContext.request.contextPath}/MyScoreController/toMyScore">我的成绩</a></li>
                    <li><a class="tab2" href="${pageContext.request.contextPath}/MyCourseCreditController/toMyCourseCredit">我的学分</a></li>
                    <li><a class="tab2" href="${pageContext.request.contextPath}/ChooseCourseController/chooseCourse">我要选课</a></li>
                </ul>
            </div>
            <div class="cztable">
                <div class="tis red">
                    注：请仔细查看【报考】考试计划以及考试时间，以免错过考试。
                </div>
                <table width="100%" cellpadding="0" cellspacing="0">
                    <tbody id="MyCourseTestTableId">
                        <tr align="center">
                            <th style="text-align: center;">
                                课程代码
                            </th>
                            <th style="text-align: center;">
                                课程名称
                            </th>
                            <th style="text-align: center;">
                                考试地点
                            </th>
                            <th style="text-align: center;">
                                考试开始时间
                            </th>
                            <th style="text-align: center;">
                                考试结束时间
                            </th>
                        </tr>
                    </tbody>

                </table>
            </div>

        </div>
    </div>
    <div class="footer">
        <p>
            &copy;copyright 2012 广博教育 csgb.net 版权所有 站长统计</p>
    </div>
</div>
</body>
</html>

