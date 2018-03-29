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
                我的学习中心&nbsp;&nbsp;&nbsp;&nbsp;</h2>



            <div class="xxlc">
                <strong class="lcbt">学历历程</strong>
            </div>
            <div class="lcbiao">
                <div class="lctime">
                    2014-05-01</div>
                <div class="lctime">
                    2014-05-02</div>
                <div class="lctime">
                    2014-05-03</div>
                <div class="lctime2">
                    2014-05-04</div>
                <div class="lctime">
                    2014-05-05</div>
                <div class="lctime">
                    2014-05-06</div>
                <div class="lctime">
                    2014-05-07</div>
            </div>
            <div class="xxjl">

                <div align="center">
        <span>
            18:10 登陆系统

              <a></a>

              </span>
                </div>


                <div align="center">
        <span>
            18:09 登陆系统

              <a></a>

              </span>
                </div>


                <div align="center">
        <span>
            18:06 登陆系统

              <a></a>

              </span>
                </div>


                <div align="center">
        <span>
            11:19 登陆系统

              <a></a>

              </span>
                </div>


            </div>

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
