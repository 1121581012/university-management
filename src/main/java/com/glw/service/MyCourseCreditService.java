package com.glw.service;

import com.glw.model.CourseCredit;
import com.glw.model.CreditAppeal;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:342018/4/4
 */
public interface MyCourseCreditService {

    /**
     * @Description: 根据学生ID查找该学生课程的学分信息
     * @MethodName: listCourseCreditByStudentId
     * @Parameter: [studentId]
     * @Return: java.util.List<com.glw.model.CourseCredit>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 15:36
     * @version V1.0
     */
    List<CourseCredit> listCourseCreditByStudentId(Integer studentId);

    /**
     * @Description: 保存学分申诉信息
     * @MethodName: saveMyCourseCreditAppeal
     * @Parameter: [creditAppeal]
     * @Return: java.lang.Integer
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 16:29
     * @version V1.0
     */
    Integer saveMyCourseCreditAppeal(CreditAppeal creditAppeal);
}
