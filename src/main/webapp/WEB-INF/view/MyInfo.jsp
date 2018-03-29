<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<head>
    <title>
        学生信息管理平台
    </title>
    <link href="${pageContext.request.contextPath}/Style/StudentStyle.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/Script/jBox/Skins/Blue/jbox.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/Style/ks.css" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/Script/jBox/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/jBox/jquery.jBox-2.3.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/jBox/i18n/jquery.jBox-zh-CN.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/Common.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/Script/Data.js" type="text/javascript"></script>
    <script type="text/javascript">
        $().ready(function () {
            setStudMsgHeadTabCheck();
            showUnreadSysMsgCount();
        });

        //我的信息头部选项卡
        function setStudMsgHeadTabCheck() {
            var currentUrl = window.location.href;
            currentUrl = currentUrl.toLowerCase();
            var asmhm = "";
            $("#ulStudMsgHeadTab li").each(function () {
                asmhm = $(this).find('a').attr("href").toLowerCase();
                if (currentUrl.indexOf(asmhm) > 0) {
                    $(this).find('a').attr("class", "tab1");
                    return;
                }
            });
        }

        //显示未读系统信息
        function showUnreadSysMsgCount() {
            var unreadSysMsgCount = "0";
            if (Number(unreadSysMsgCount) > 0) {
                $("#unreadSysMsgCount").html("(" + unreadSysMsgCount + ")");
            }
        }

        //退出
        function loginOut() {
            if (confirm("确定退出吗？")) {
                StudentLogin.loginOut(function (data) {
                    if (data == "true") {
                        window.location = "/Login.aspx";
                    }
                    else {
                        jBox.alert("退出失败！", "提示", new {buttons: {"确定": true}});
                    }
                });
            }
        }

        //更改报考类别
        function changeCateory(thisObj, id) {
            var oldCateoryId = $("#cateoryId").val();
            var cateoryId = "";
            if (id != null) {
                cateoryId = id;
            }
            else {
                cateoryId = thisObj.val();
            }
            var studentId = $("#studentId").val();
            if (cateoryId.length <= 0) {
                jBox.tip("报考类别不能为空！");
                if (id == null) {
                    thisObj.val(oldCateoryId);
                }
            }
            else {
                studentInfo.changeStudentCateory(cateoryId, function (data) {
                    var result = $.parseJSON(data);
                    if ((String(result.ok) == "true")) {
                        window.location.href = "/Index.aspx";
                    }
                    else {
                        jBox.tip(result.message);
                    }
                });
            }
        }
    </script>


</head>
<body>

<jsp:include page="head.jsp"></jsp:include>
<div class="page">
    <div class="box mtop">
        <div class="leftbox">
            <jsp:include page="leftbody.jsp"></jsp:include>
        </div>
        <div class="rightbox">
            <h2 class="mbx">我的信息 &gt; 个人资料 &nbsp;&nbsp;&nbsp;</h2>
            <div class="morebt">
                <ul id="ulStudMsgHeadTab">
                    <li><a class="tab2" onclick="" href="${pageContext.request.contextPath}/myInfo">个人资料</a></li>
                    <li><a class="tab2" onclick="" href="Objection.aspx.html">我的异议</a></li>
                </ul>
            </div>
            <div class="cztable">
                <table width="100%" cellpadding="0" cellspacing="0">
                    <tr>
                        <td align="right" width="80">姓名：</td>
                        <td>${baseinfo.name}&nbsp;</td>
                        <td align="right" width="90">身份证号码：</td>
                        <td>${baseinfo.idCard}&nbsp;</td>

                        <td rowspan="9">
                            <div align="center"><img id="pic_face" height="160" width="120"
                                                     src="${pageContext.request.contextPath}/images/Student/photo.jpg" style="padding:2px 2px 5px;
                                border:1px #ddd solid;">
                            </div>&nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td align="right">性别：</td>
                        <td>${baseinfo.gender}&nbsp;</td>
                        <td align="right">学号：</td>
                        <td>${baseinfo.id}&nbsp;</td>
                    </tr>
                    <tr>
                        <td align="right">籍贯：</td>
                        <td>${baseinfo.nativePlace}</td>
                        <td align="right">出生日期：</td>
                        <td><fmt:formatDate value="${baseinfo.birth}" pattern="yyyy-MM-dd"/>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">报考专业：</td>
                        <td>${baseinfo.major}&nbsp;</td>
                        <td align="right">入学时间：</td>
                        <td><fmt:formatDate value="${baseinfo.comeTime}" pattern="yyyy-MM-dd"/></td>
                    </tr>


                    <tr>
                        <td colspan="4" align="left">联系方式（如联系方式有变动请及时修改，以便能及时联系到你。谢谢！）</td>

                    </tr>
                    <tr>
                        <td align="right">手机号码：</td>
                        <td>${baseinfo.phone}</td>
                        <td align="right">第二联系号码：</td>
                        <td>${baseinfo.secondPhone}</td>

                    </tr>
                    <tr>
                        <td align="right">QQ:</td>
                        <td>${baseinfo.qq}</td>
                        <td align="right" >电子邮箱：</td>
                        <td>${baseinfo.email}</td>

                    </tr>
                    <tr>
                        <td align="right">联系地址：</td>
                        <td colspan="4">${baseinfo.location}</td>
                    </tr>
                    <tr align="center">
                        <td colspan="5" height="40">
                            <div align="center">
                                <input type="button" id="button2" value="我要修改信息" onclick="submitMail()"
                                       class="input2"/>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>

        </div>
    </div>
    <div class="footer">
        <p>
            &copy;copyright 2012 广博教育 csgb.net 版权所有 站长统计</p>
    </div>
</div>
<script type="text/javascript" src="Script/Data.js"></script>
<script type="text/javascript" src="MyJs/MyInfo.js"></script>
</body>
</html>
