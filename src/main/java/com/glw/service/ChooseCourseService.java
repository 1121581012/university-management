package com.glw.service;

import com.glw.model.Course;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 13:252018/3/30
 */
public interface ChooseCourseService {

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
    List<Course> listAllCourse();

}
