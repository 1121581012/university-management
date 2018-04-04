package com.glw.controller;

import com.glw.model.CourseCredit;
import com.glw.model.CreditAppeal;
import com.glw.service.MyCourseCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:052018/4/4
 */
@Controller
@RequestMapping("MyCourseCreditController")
public class MyCourseCreditController {
    @Autowired
    private MyCourseCreditService myCourseCreditService;

    @RequestMapping("toMyCourseCredit")
    public String toMyCourseCredit() {
        return "MyCourseCredit";
    }

    /**
     * @Description: 显示我的课程学分
     * @MethodName: showMyCourseCredit
     * @Parameter: [session]
     * @Return: java.util.List<com.glw.model.CourseCredit>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 15:38
     * @version V1.0
     */
    @RequestMapping("showMyCourseCredit")
    @ResponseBody
    public List<CourseCredit> showMyCourseCredit(HttpSession session){
        Integer studentId = (Integer) session.getAttribute("id");
        return myCourseCreditService.listCourseCreditByStudentId(studentId);
    }

    @RequestMapping("saveMyCourseCreditAppeal")
    @ResponseBody
    public String saveMyCourseCreditAppeal(HttpSession session, CreditAppeal creditAppeal){
        Integer studentId = (Integer) session.getAttribute("id");
        creditAppeal.setStudentId(studentId);
        myCourseCreditService.saveMyCourseCreditAppeal(creditAppeal);
        return null;
    }

}
