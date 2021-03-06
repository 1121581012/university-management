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
     * @Description: 根据学生ID修改登录密码
     * @MethodName: updateLoginPassWordByStudentId
     * @Parameter: Integer studentId, String passWord
     * @Return: int
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 12:31
     * @version V1.0
     */
    int updateLoginPassWordByStudentId(@Param("studentId")Integer studentId, @Param("passWord") String passWord);
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