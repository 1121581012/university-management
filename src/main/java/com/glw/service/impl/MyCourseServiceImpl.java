package com.glw.service.impl;

import com.glw.dao.MyCourseMapper;
import com.glw.model.Course;
import com.glw.model.MyCourse;
import com.glw.service.MyCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:022018/3/30
 */
@Service
public class MyCourseServiceImpl implements MyCourseService {
    @Autowired
    private MyCourseMapper myCourseMapper;

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
    @Override
    public List<MyCourse> listMyCourseByStudentIdAndCourseId(Integer studentId, Integer courseId) {
        return myCourseMapper.listMyCourseByStudentIdAndCourseId(studentId,courseId);
    }

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
    @Override
    public void saveMyCourse(MyCourse myCourse) {
        myCourseMapper.insertSelective(myCourse);
    }

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
    @Override
    public List<Course> listCourseByStudentId(Integer studentId) {
        return myCourseMapper.listCourseByStudentId(studentId);
    }

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
    @Override
    public Integer deleteMyCourseByCourseIdAndeStudentId(Integer studentId, Integer courseId) {

        return myCourseMapper.deleteMyCourseByCourseIdAndeStudentId(studentId,courseId);
    }
}
