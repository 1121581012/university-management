package com.glw.service.impl;

import com.glw.dao.CourseMapper;
import com.glw.model.Course;
import com.glw.service.ChooseCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 13:252018/3/30
 */
@Service
public class ChooseCourseServiceImpl implements ChooseCourseService {

    @Autowired
    private CourseMapper courseMapper;

    /**查询所有课程信息
     * @Description:查询所有课程信息
     * @MethodName: listAllCourse
     * @Parameter: []
     * @Return: java.util.List<com.glw.model.Course>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 13:27
     * @version V1.0
     */
    @Override
    public List<Course> listAllCourse() {
        return  courseMapper.listAllCourse();
    }
}
