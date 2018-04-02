package com.glw.service;

import com.glw.model.CourseTest;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:242018/3/30
 */
public interface CourseTestService {

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
    List<CourseTest> listCourseTestByCourseId(Integer courseId);
}
