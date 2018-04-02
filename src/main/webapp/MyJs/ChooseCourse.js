(function ($) {
    initChooseCourseTable();
})(jQuery);

function initChooseCourseTable() {
    ajaxGet(webroot + "ChooseCourseController/showChooseCourse", "", function (data) {
        var courses = data.courses;
        var html;
        if (courses != undefined && courses != null && courses != ""){
            for (var i = 0;i<courses.length;i++) {
                html +="<tr align=\"center\">" +
                    "      <td >"+courses[i].id+"</td>" +
                    "      <td >"+courses[i].name+"</td>" +
                    "      <td >"+courses[i].startTime+"</td>" +
                    "      <td >"+courses[i].finishTime+"</td>" ;
                var flag = checkTime(courses[i].startTime,courses[i].finishTime);
                if (flag){
                    html += "<td><a href='javascript:void(0)' onclick='chooseCourse("+courses[i].id+")'>选课</a></td>"
                }else{
                    html += "<td>暂不可选</td>"
                }
                html += "</tr>";
            }
        }else{
            html += "<tr align=\"center\">" +
                " <td colspan=\"13\" align=\"left\" style=\"color: Red; font-weight:bold;\">没有可选课程!</td></tr>";
        }
        $("#ChooseCourseTableId").append(html);
    });
}

function chooseCourse(courseId) {
    var data = {id:courseId};
    ajaxPost(webroot + "ChooseCourseController/studentChooseCourse", data, function (data) {
        if (data){
            $.jBox.tip("选课成功");
        }else{
            $.jBox.tip("选课失败，已经选择过该课程");
        }
    })
}

/**
 * 比较当前时间是否在开始选课时间与结束选课时间之间
 * @param stime
 * @param etime
 * @returns {boolean}
 */
function checkTime(stime, etime) {
    //开始时间
    var arrs = stime.split("-");
    var startTime = new Date(arrs[0], arrs[1], arrs[2]);
    var startTimes = startTime.getTime();
    //结束时间
    var arre = etime.split("-");
    var endTime = new Date(arre[0], arre[1], arre[2]);
    var endTimes = endTime.getTime();
    //当前时间
    var thisDate = new Date();
    var thisDates = thisDate.getFullYear() + "-0" + (thisDate.getMonth() + 1) + "-" + thisDate.getDate();
    var arrn = thisDates.split("-");
    var nowTime = new Date(arrn[0], arrn[1], arrn[2]);
    var nowTimes = nowTime.getTime();
    if (nowTimes < startTimes || nowTimes > endTimes) {
        return false;
    }
    return true;
}
