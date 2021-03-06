package com.glw.dao;

import com.glw.model.CourseCredit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Hello
 */
public interface CourseCreditMapper {


    /**
     * @Description: 根据学生ID查看学生课程学分信息
     * @MethodName: listCourseCreditByStudentId
     * @Parameter:
     * @Return:
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 15:28
     * @version V1.0
     */
    List<CourseCredit> listCourseCreditByStudentId(@Param("studentId") Integer studentId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    int insert(CourseCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    int insertSelective(CourseCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    CourseCredit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CourseCredit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_credit
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CourseCredit record);
}