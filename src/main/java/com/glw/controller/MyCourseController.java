package com.glw.controller;

import com.glw.model.Course;
import com.glw.model.MyCourse;
import com.glw.service.MyCourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 20:352018/4/2
 */
@Controller
@RequestMapping("MyCourseController")
public class MyCourseController {
    @Autowired
    private MyCourseService myCourseService;

    /**
     * @Description:显示我的选课界面
     * @MethodName: toMyCourse
     * @Parameter: []
     * @Return: java.lang.String
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/2 21:05
     * @version V1.0
     */
    @RequestMapping("toMyCourse")
    public String toMyCourse(){
        return "MyCourse";
    }


    /**
     * @Description: 根据学生ID查询该学生选择的课程
     * @MethodName: showMyCourse
     * @Parameter: [session]
     * @Return: java.util.List<com.glw.model.Course>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/2 22:22
     * @version V1.0
     */
    @RequestMapping("showMyCourse")
    @ResponseBody
    public List<Course> showMyCourse(HttpSession session) {
        Integer studentId = (Integer) session.getAttribute("id");
        List<Course> courses = myCourseService.listCourseByStudentId(studentId);
        return courses;
    }

    /**
     * @Description: 学生退课
     * @MethodName: deleteMyCourse
     * @Parameter: [session, id]
     * @Return: java.lang.Boolean
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/2 22:35
     * @version V1.0
     */
    @RequestMapping("deleteMyCourse")
    @ResponseBody
    public Boolean deleteMyCourse(HttpSession session,@RequestParam("courseId") Integer id) {

        Integer studentId = (Integer) session.getAttribute("id");
        Integer courseId = id;
        List<MyCourse> myCourses = myCourseService.listMyCourseByStudentIdAndCourseId(studentId, courseId);
        if (myCourses.size() > 0) {
            myCourseService.deleteMyCourseByCourseIdAndeStudentId(studentId,courseId);
            return true;
        } else {
            return false;
        }
    }

}
