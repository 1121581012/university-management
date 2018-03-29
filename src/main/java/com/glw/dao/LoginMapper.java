package com.glw.dao;

import com.glw.model.Login;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper {

    /**
     * 用于学生登录，根据学生id查找，判断输入账号密码是否正确
     * @param studentId
     * @return
     */
    Login selectByStudentId(@Param("studentId")Integer studentId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    int insert(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    int insertSelective(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    Login selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Login record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Login record);
}