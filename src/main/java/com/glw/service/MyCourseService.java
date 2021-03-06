package com.glw.service;

import com.glw.model.Course;
import com.glw.model.MyCourse;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:022018/3/30
 */
public interface MyCourseService {

    /**
     * @Description: 根据学生ID，课程ID查看学生是否已经选了这门课
     * @MethodName: listMyCourseByStudentIdAndCourseId
     * @Parameter: [studentId, courseId]
     * @Return: java.util.List<com.glw.model.MyCourse>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 15:05
     * @version V1.0
     */
    List<MyCourse> listMyCourseByStudentIdAndCourseId(Integer studentId, Integer courseId);

    /**
     * @Description:将课程添加到学生选课表，表示学生已经选课
     * @MethodName: saveMyCourse
     * @Parameter: [myCourse]
     * @Return: void
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/30 15:41
     * @version V1.0
     */
    void saveMyCourse(MyCourse myCourse);

    /**
     * @Description: 根据学生ID查询该学生选择的课程
     * @MethodName: listCourseByStudentId
     * @Parameter: [studentId]
     * @Return: java.util.List<com.glw.model.Course>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/2 22:20
     * @version V1.0
     */
    List<Course> listCourseByStudentId(Integer studentId);


    /**
     * @Description: 根据学生ID，课程ID 删除我的选课
     * @MethodName: deleteMyCourseByCourseIdAndeStudentId
     * @Parameter: [studentId, courseId]
     * @Return: java.lang.Integer
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/2 22:45
     * @version V1.0
     */
    Integer deleteMyCourseByCourseIdAndeStudentId(Integer studentId, Integer courseId);


}
