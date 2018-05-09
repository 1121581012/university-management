(function ($) {
    initMyAppealTable();
})(jQuery);

function initMyAppealTable() {
    ajaxGet(webroot + "MyAppeal/showMyAppeal", "", function (data) {
        var myAppeals = data.myAppeals;
        var html;
        if (myAppeals != undefined && myAppeals != null && myAppeals != ""){
            for (var i = 0;i<myAppeals.length;i++) {
                var num = parseInt(i)+1;
                html +="<tr align=\"center\">" +
                    "      <td >"+num+"</td>" ;
                switch (myAppeals[i].type){
                    case 1 :
                        html +=  "<td >信息申诉</td>";
                        break;
                    case 2 :
                        html +=  "<td >成绩申诉</td>";
                        break;
                    case 3 :
                        html +=  "<td >学分申诉</td>";
                        break;
                };
                var formatTime = dateFormat(myAppeals[i].time);
                html += "<td >"+myAppeals[i].desc+"</td>"+
                       " <td >"+formatTime+"</td>";
                switch (myAppeals[i].status){
                    case 1 :
                        html +=  "<td >已处理</td>";
                        break;
                    case 2 :
                        html +=  "<td >未处理</td>";
                        break;
                };
                html += "</tr>";
            }
        }else{
            html += "<tr align=\"center\">" +
                " <td colspan=\"13\" align=\"left\" style=\"color: Red; font-weight:bold;\">未找到异议信息!</td></tr>";

        }
        $("#MyAppealTableDiv").append(html);

    });
}

/**
 * 格式化后台传过来的longTypeDate
 * @param longTypeDate
 * @returns {string}
 */
function dateFormat(longTypeDate){
    var dateType = "";
    var date = new Date();
    date.setTime(longTypeDate);
    dateType += date.getFullYear();  //年
    dateType += "-" + getMonth(date); //月
    dateType += "-" + getDay(date);  //日
    return dateType;
}
//返回 01-12 的月份值
function getMonth(date){
    var month = "";
    month = date.getMonth() + 1; //getMonth()得到的月份是0-11
    if(month<10){
        month = "0" + month;
    }
    return month;
}
//返回01-30的日期
function getDay(date){
    var day = "";
    day = date.getDate();
    if(day<10){
        day = "0" + day;
    }
    return day;
}