package com.glw.service.impl;

import com.glw.dao.CourseTestMapper;
import com.glw.model.CourseTest;
import com.glw.service.CourseTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:252018/3/30
 */
@Service
public class CourseTestServiceImpl implements CourseTestService{

    @Autowired
    private CourseTestMapper courseTestMapper;

    /**
     * @Description: 根据课程ID查询课程考试信息
     * @MethodName: listCourseTestByCourseId
     * @Parameter: [courseId]
     * @Return: java.util.List<com.glw.model.CourseTest>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 15:34
     * @version V1.0
     */
    @Override
    public List<CourseTest> listCourseTestByCourseId(Integer courseId) {
        return courseTestMapper.listCourseTestByCourseId(courseId);
    }
}
