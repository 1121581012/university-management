/**
 *我要修改信息
 */
function submitMail() {

        var html = "<div style='padding:10px;'><div style='width:65px; height:120px; float:left;'>申请修改的地方：</div><div style='width:250px; height:120px; float:left;'><textarea id='myInfoUpdate' name='myInfoUpdate' style='width:250px; height:105px;'></textarea></div></div>";
        var submit = function (v, h, f) {
            if (f.myInfoUpdate == '' || f.myInfoUpdate.length > 80) {
                $.jBox.tip("请您输入要修改的内容！", 'error', {focusId: "myInfoUpdate"}); // 关闭设置 objeCont 为焦点
                return false;
            }
            var myInfoUpdate = $("#myInfoUpdate").val();
            BaseInfoAppeal.saveBaseInfoAppeal(myInfoUpdate, function (data) {
                    $.jBox.tip("成功提交申请！");
            });
        };
        $.jBox(html, {title: "联系信息", submit: submit});
    }
