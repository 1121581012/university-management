//退出
function loginOut() {
    if (confirm("确定退出吗？")) {
        ajaxGet(webroot+"/loginOut", {}, function (data) {
            if (data) {
                window.location = webroot;
            }
            else {
                jBox.alert("退出失败！", "提示");
            }
        });
    }
}