<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /><title>
    学生信息管理平台
</title>
    <script type="text/javascript">
        var webroot = '<%=request.getContextPath()%>/';
    </script>
    <link href="../Style/StudentStyle.css" rel="stylesheet" type="text/css" />
    <link href="../Script/jBox/Skins/Blue/jbox.css" rel="stylesheet" type="text/css" />
    <link href="../Style/ks.css" rel="stylesheet" type="text/css" />
    <script src="../Script/jBox/jquery-1.4.2.min.js" type="text/javascript"></script>
    <script src="../Script/jBox/jquery.jBox-2.3.min.js" type="text/javascript"></script>
    <script src="../Script/jBox/i18n/jquery.jBox-zh-CN.js" type="text/javascript"></script>
    <script src="../Script/Common.js" type="text/javascript"></script>
    <script src="../Script/Data.js" type="text/javascript"></script>
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
                        jBox.alert("退出失败！", "提示", new { buttons: { "确定": true} });
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

    <link href="../Style/StudentStyle.css" rel="stylesheet" type="text/css" />
    <script src="../Script/Base.js" type="text/javascript"></script>
    <script language="javascript" type="text/javascript">
        function confirmStatus(sid) {
            if (confirm("确定确认无误吗？") == true) {
                senateCenter.modifyStudentSignupExamStatus(sid, 2, function (data) {
                    var result = $.parseJSON(data);
                    if ((String(result.ok) == "true")) {
                        jBox.alert(result.message, '提示');
                        setTimeout(function () {
                            window.location.reload();
                        }, 1500);
                    }
                    else {
                        jBox.tip(result.message);
                    }
                });
            }
        }

        function submitObjection(objId) {
            var mtitle = "报考有异议";
            var html = "<div style='padding:10px;'><div style='width:65px; height:120px; float:left;'>异议内容：</div><div style='width:250px; height:120px; float:left;'><textarea id='objeCont' name='objeCont' style='width:250px; height:105px;'></textarea></div></div>";

            var submit = function (v, h, f) {
                if (f.objeCont == '' || f.objeCont.length > 80) {
                    $.jBox.tip("请您输入异议内容，且不超过80个字！", 'error', { focusId: "objeCont" }); // 关闭设置 objeCont 为焦点
                    return false;
                }

                StudentCompain.insertCompain('', mtitle, 2, f.objeCont, function (data) {
                    var obj = $.parseJSON(data);
                    var resultObj = false;
                    if (obj.ok) {
                        senateCenter.modifyStudentSignupExamStatus(objId, 3, function (data) {
                            var result = $.parseJSON(data);
                            if ((String(result.ok) == "true")) {
                                jBox.alert("成功提交异议！", "提示");
                                setTimeout(function () {
                                    window.location.reload();
                                }, 1500);
                            }
                            else {
                                jBox.tip("提交异议失败！");
                                return false;
                            }
                        });
                    }
                    else {
                        jBox.tip("提交异议失败！");
                    }
                });
            };

            $.jBox(html, { title: "提交异议", submit: submit });
        }
        function showApp(i1, i2, i3) {
            var amount1 = i1 * 48;
            var amount2 = i2 * 348;
            var amount3 = i3 * 168;
            var aamount = amount1 + amount2 + amount3;
            $("#BCount").html(i1);
            $("#LCount").html(i2);
            $("#SCount").html(i3);
            $("#BAmount").html(amount1);
            $("#LAmount").html(amount2);
            $("#SAmount").html(amount3);
            $("#AAmount").html(aamount);
            $.jBox("id:MyAppMoney", {
                title: "报考费详情",
                width: 510,
                height: 280,
                buttons: { '关闭': true }
            });
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

            <h2 class="mbx">
                教务中心 &gt; 我的报考</h2>
            <jsp:include page="title.jsp"></jsp:include>
            <div class="cztable">
                <div class="tis red">
                    注：请仔细查看【报考】考试计划以及考试时间，以免错过考试。
                </div>
                <table width="100%" cellpadding="0" cellspacing="0">
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

                    <tr style="height: 28px" class="tdbg" align="center">
                        <td colspan="13" align="left" style="color: Red; font-weight: bold;">
                            未找到考试计划信息！
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
</body>
</html>

