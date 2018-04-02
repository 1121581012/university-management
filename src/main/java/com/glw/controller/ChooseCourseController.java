package com.glw.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.glw.model.Course;
import com.glw.model.CourseTest;
import com.glw.model.MyCourse;
import com.glw.service.ChooseCourseService;
import com.glw.service.CourseTestService;
import com.glw.service.MyCourseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 11:282018/3/30
 */
@Controller
@RequestMapping("ChooseCourseController")
public class ChooseCourseController {
    @Autowired
    private ChooseCourseService chooseCourseService;
    @Autowired
    private MyCourseService myCourseService;
    @Autowired
    private CourseTestService courseTestService;

    /**
     * @Description: 跳转选课页面
     * @MethodName: chooseCourse
     * @Parameter: []
     * @Return: java.lang.String
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 14:33
     * @version V1.0
     */
    @RequestMapping("chooseCourse")
    public String chooseCourse() {
        return "ChooseCourse";
    }

    /**
     * @Description: 查询所有课程显示在选课界面
     * @MethodName: showChooseCourse
     * @Parameter: []
     * @Return: java.util.Map<java.lang.String , java.lang.Object>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 14:32
     * @version V1.0
     */
    @RequestMapping("showChooseCourse")
    @ResponseBody
    public Map<String, Object> showChooseCourse() {
        Map<String, Object> map = new HashMap<String, Object>(1);
        List<Course> courses = chooseCourseService.listAllCourse();
        map.put("courses", courses);
        return map;
    }

    /**
     * @Description: 学生选课
     * @MethodName: studentChooseCourse
     * @Parameter: [session, id]
     * @Return: java.util.Map<java.lang.String , java.lang.Object>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 14:42
     * @version V1.0
     */
    @RequestMapping(value="studentChooseCourse")
    @ResponseBody
    public Boolean studentChooseCourse(HttpSession session, @Param("id") String id) throws UnsupportedEncodingException {
        Integer studentId = (Integer) session.getAttribute("id");
        Integer courseId = Integer.parseInt(id);
        List<MyCourse> myCourses = myCourseService.listMyCourseByStudentIdAndCourseId(studentId, courseId);
        if (myCourses.size() > 0){
            return false;
        }else{
            MyCourse myCourse = new MyCourse();
            myCourse.setCourseId(courseId);
            myCourse.setStudentId(studentId);
            List<CourseTest> courseTest = courseTestService.listCourseTestByCourseId(courseId);
            if (courseTest.size()>0){
                myCourse.setCourseName(courseTest.get(0).getCourseName());
                myCourse.setLocation(courseTest.get(0).getLocation());
                myCourse.setStartTime(courseTest.get(0).getStartTime());
                myCourse.setFinishTime(courseTest.get(0).getFinishTime());
            }
            myCourseService.saveMyCourse(myCourse);
            return true;
        }
    }


}
