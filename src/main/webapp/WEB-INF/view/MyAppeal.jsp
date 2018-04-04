<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html >
<head><meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/MyJs/MyAppeal.js"></script>
</head>
<body>

<jsp:include page="head.jsp"></jsp:include>
<div class="page">
    <div class="box mtop">
        <div class="leftbox">
            <jsp:include page="leftbody.jsp"></jsp:include>
        </div>
        <div class="rightbox">

            <h2 class="mbx">我的信息 &gt; 我的异议</h2>
            <div class="morebt">
                <ul id="ulStudMsgHeadTab">
                    <li><a class="tab2" onclick="" href="${pageContext.request.contextPath}/myInfo">个人资料</a> </li>
                    <li><a class="tab1" onclick="" href="${pageContext.request.contextPath}/MyAppeal/myAppeal">我的异议</a></li>
                </ul>
            </div>
            <div class="cztable" >
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tbody id="MyAppealTableDiv">
                    <tr style="height: 25px" align="center">
                        <th style="text-align:center;" width="10%">序号</th>
                        <th style="text-align:center;" width="10%">类型</th>

                        <th width="30%">内容</th>
                        <th style="text-align:center;" width="18%">添加时间</th>
                        <th style="text-align:center;" width="13%">状态</th>
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
