package com.glw.dao;

import com.glw.model.CourseCredit;

public interface CourseCreditMapper {
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