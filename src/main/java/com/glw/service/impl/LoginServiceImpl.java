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

    @Override
    public void updateLastLoginTime(Login login) {
        loginMapper.updateByPrimaryKeySelective(login);
    }

    @Override
    public StudentBaseinfo selectBystudentId(Integer studentId) {
        return studentBaseinfoMapper.selectByPrimaryKey(studentId);
    }
}
