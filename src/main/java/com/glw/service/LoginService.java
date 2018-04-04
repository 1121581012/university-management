package com.glw.service;

import com.glw.model.Login;
import com.glw.model.StudentBaseinfo;

/**
 * @author GAO
 */
public interface LoginService {

    /**
     * 登录方法
     * @param studentId
     * @return
     */
    Login login(Integer studentId);

    /**
     * @Description: 根据学生ID修改登录密码
     * @MethodName: updateLoginPassWordByStudentId
     * @Parameter: [studentId, passWord]
     * @Return: Integer
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 12:36
     * @version V1.0
     */
    Integer updateLoginPassWordByStudentId(Integer studentId, String passWord);

    /**登陆后，更新最后登录时间
     * @param login
     */
    void updateLastLoginTime(Login login);
    /**  登录时，根据学生id，查找学生信息，用于head显示
     *   也用在基本信息显示
     * @author GLW 
     * @Email 1121581012@qq.com
     * @MethodName:selectBystudentId
     * @date 2018/1/7 15:01  
     * @param   studentId
     * @return   
     * @version V1.0
     */ 
    StudentBaseinfo selectBystudentId(Integer studentId);


}
