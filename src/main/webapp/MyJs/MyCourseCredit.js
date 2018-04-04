(function ($) {
    initMyCourseCreditTable();
})(jQuery);

function initMyCourseCreditTable() {
    ajaxGet(webroot + "MyCourseCreditController/showMyCourseCredit", "", function (data) {
        var courseCredit = data;
        var html;
        if (courseCredit != undefined && courseCredit != null && courseCredit != ""){
            for (var i = 0;i<courseCredit.length;i++) {
                html +="<tr align=\"center\" class='forRemove'>" +
                    "      <td >"+courseCredit[i].courseId+"</td>" +
                    "      <td >"+courseCredit[i].courseName+"</td>" +
                    "      <td >"+courseCredit[i].credit+"</td>" ;
                var need = courseCredit[i].courseId+",'"+courseCredit[i].courseName+"','"+courseCredit[i].credit+"'";
                html += "<td><a href='javascript:void(0)' onclick='myCourseCreditAppeal("+courseCredit[i].courseId+",\""+courseCredit[i].courseName+"\","+courseCredit[i].credit+")'>申请复查</a></td>"
                html += "</tr>";
            }
        }else{
            html += "<tr align=\"center\" class='forRemove'>" +
                " <td colspan=\"13\" align=\"left\" style=\"color: Red; font-weight:bold;\">没有课程学分信息!</td></tr>";
        }
        $("#MyCourseCreditTableId").append(html);
    });
}

/**
 *申请复查
 */
function myCourseCreditAppeal(courseId,courseName,credit) {

    var html = "<div style='padding:10px;'><div style='width:65px; height:120px; float:left;'>简要说明情况：</div><div style='width:250px; height:120px; float:left;'><textarea id='myCourseCreditUpdate' name='myCourseCreditUpdate' style='width:250px; height:105px;'></textarea></div></div>";
    var submit = function (v, h, f) {
        if (f.myCourseCreditUpdate == '' || f.myCourseCreditUpdate.length > 80) {
            $.jBox.tip("请您输入要修改的内容！", 'error', {focusId: "myCourseCreditUpdate"}); // 关闭设置 objeCont 为焦点
            return false;
        }
        var myCourseCreditUpdate = $("#myCourseCreditUpdate").val();
        var date = {courseId:courseId, courseName:courseName, desc:myCourseCreditUpdate, courseCredit:credit};
        ajaxPost(webroot+"MyCourseCreditController/saveMyCourseCreditAppeal", date, function (data) {
            $.jBox.tip("成功提交申请！");
        });
    };
    $.jBox(html, {title: "联系信息", submit: submit});
}
