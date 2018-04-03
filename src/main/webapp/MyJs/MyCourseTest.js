(function ($) {
    initMyCourseTestTable();
})(jQuery);

function initMyCourseTestTable() {
    ajaxGet(webroot + "MyCourseController/showCourseTest", "", function (data) {
        var courses = data;
        var html;
        if (courses != undefined && courses != null && courses != ""){
            for (var i = 0;i<courses.length;i++) {
                html +="<tr align=\"center\" class='forRemove'>" +
                    "      <td >"+courses[i].courseId+"</td>" +
                    "      <td >"+courses[i].courseName+"</td>" +
                    "      <td >"+courses[i].location+"</td>" +
                    "      <td >"+courses[i].startTime+"</td>" +
                    "      <td >"+courses[i].finishTime+"</td>" ;
                html += "</tr>";
            }
        }else{
            html += "<tr align=\"center\" class='forRemove'>" +
                " <td colspan=\"13\" align=\"left\" style=\"color: Red; font-weight:bold;\">没有考试计划信息!</td></tr>";
        }
        $("#MyCourseTestTableId").append(html);
    });
}