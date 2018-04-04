(function ($) {
    initMyScoreTable();
})(jQuery);

function initMyScoreTable() {
    ajaxGet(webroot + "MyScoreController/showMyScore", "", function (data) {
        var scores = data;
        var html;
        if (scores != undefined && scores != null && scores != ""){
            for (var i = 0;i<scores.length;i++) {
                html +="<tr align=\"center\" class='forRemove'>" +
                    "      <td >"+scores[i].courseId+"</td>" +
                    "      <td >"+scores[i].courseName+"</td>" +
                    "      <td >"+scores[i].score+"</td>" ;
                html += "<td><a href='javascript:void(0)' onclick='myScoreAppeal("+scores[i].courseId+",\""+scores[i].courseName+"\")'>申请复查</a></td>"
                html += "</tr>";
            }
        }else{
            html += "<tr align=\"center\" class='forRemove'>" +
                " <td colspan=\"13\" align=\"left\" style=\"color: Red; font-weight:bold;\">没有选课信息!</td></tr>";
        }
        $("#MyScoreTableId").append(html);
    });
}


/**
 *申请复查
 */
function myScoreAppeal(courseId,courseName) {

    var html = "<div style='padding:10px;'><div style='width:65px; height:120px; float:left;'>简要说明情况：</div><div style='width:250px; height:120px; float:left;'><textarea id='myScoreUpdate' name='myScoreUpdate' style='width:250px; height:105px;'></textarea></div></div>";
    var submit = function (v, h, f) {
        if (f.myScoreUpdate == '' || f.myScoreUpdate.length > 80) {
            $.jBox.tip("请您输入要修改的内容！", 'error', {focusId: "myScoreUpdate"}); // 关闭设置 objeCont 为焦点
            return false;
        }
        var myScoreUpdate = $("#myScoreUpdate").val();
        var date = {courseId:courseId, courseName:courseName, desc:myScoreUpdate};
        ajaxPost(webroot+"MyScoreController/saveMyScoreAppeal", date, function (data) {
            $.jBox.tip("成功提交申请！");
        });
    };
    $.jBox(html, {title: "联系信息", submit: submit});
}
