package com.glw.controller;

import com.glw.model.Login;
import com.glw.model.StudentBaseinfo;
import com.glw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author: GaoLiWei
 * @Date: Created in 11:282018/4/4
 */
@Controller
@RequestMapping("ChangePasswordController")
public class ChangePasswordController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("toChangePassword")
    public String toChangePassword() {
        return "ChangePassword";
    }

    @RequestMapping("changePassword")
    @ResponseBody
    public Boolean changePassword(HttpSession session, @RequestParam("oldPassWord") String oldPassWord, @RequestParam("newPassWord") String newPassWord) {
        Integer studentId = (Integer) session.getAttribute("id");
        Login login = loginService.login(studentId);
        if (null != login) {
            if (oldPassWord.equals(login.getPassword())) {
                loginService.updateLoginPassWordByStudentId(studentId, newPassWord);
                return true;
            }
        }
        return false;
    }
}
