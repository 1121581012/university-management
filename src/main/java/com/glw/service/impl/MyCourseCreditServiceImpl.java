package com.glw.service.impl;

import com.glw.dao.CourseCreditMapper;
import com.glw.dao.CreditAppealMapper;
import com.glw.model.CourseCredit;
import com.glw.model.CreditAppeal;
import com.glw.service.MyCourseCreditService;
import com.glw.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:342018/4/4
 */
@Service
public class MyCourseCreditServiceImpl implements MyCourseCreditService {
    @Autowired
    private CourseCreditMapper courseCreditMapper;
    @Autowired
    private CreditAppealMapper creditAppealMapper;


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
    @Override
    public List<CourseCredit> listCourseCreditByStudentId(Integer studentId) {
        return courseCreditMapper.listCourseCreditByStudentId(studentId);
    }

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
    @Override
    public Integer saveMyCourseCreditAppeal(CreditAppeal creditAppeal) {
        creditAppeal.setTime(new Date());
        creditAppeal.setStatus(Constants.APPEAL_STATUS_NO);
        creditAppeal.setType(Constants.APPEAL_TYPE_CREDIT);
        return creditAppealMapper.insertSelective(creditAppeal);
    }
}
