package com.glw.controller;
import com.glw.model.Login;
import com.glw.model.StudentBaseinfo;
import com.glw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author GAO
 */
@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("login")
    public String login(Login login, HttpSession session){
        Login selectByStudentId = loginService.login(login.getStudentId());
        if(selectByStudentId == null){
            return "redirect:loginFail.jsp";
        }
        final boolean  checkLogin = login.getPassword().equals(selectByStudentId.getPassword());
        if(checkLogin != true){
            return "redirect:loginFail.jsp";
        }
        if(checkLogin){
            selectByStudentId.setLoginTime(new Date(System.currentTimeMillis()));
            loginService.updateLastLoginTime(selectByStudentId);
            StudentBaseinfo studentBaseinfo = loginService.selectBystudentId(selectByStudentId.getStudentId());
            session.setAttribute("name",studentBaseinfo.getName());
            session.setAttribute("id",studentBaseinfo.getId());
            return "welcome";
        }
        return "redirect:loginFail.jsp";
    }


}
