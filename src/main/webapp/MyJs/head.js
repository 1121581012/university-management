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