package com.glw.service.impl;

import com.glw.dao.LoginMapper;
import com.glw.dao.StudentBaseinfoMapper;
import com.glw.model.Login;
import com.glw.model.StudentBaseinfo;
import com.glw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author GAO
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginMapper loginMapper;
    @Autowired
    private StudentBaseinfoMapper studentBaseinfoMapper;

    @Override
    public Login login(Integer studentId) {
        return loginMapper.selectByStudentId(studentId);
    }

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
    @Override
    public Integer updateLoginPassWordByStudentId(Integer studentId, String passWord) {
        return loginMapper.updateLoginPassWordByStudentId(studentId,passWord);
    }

    @Override
    public void updateLastLoginTime(Login login) {
        loginMapper.updateByPrimaryKeySelective(login);
    }

    @Override
    public StudentBaseinfo selectBystudentId(Integer studentId) {
        return studentBaseinfoMapper.selectByPrimaryKey(studentId);
    }
}
