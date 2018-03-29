package com.glw.controller;

import com.glw.model.StudentBaseinfo;
import com.glw.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @version V1.0
 * @author: GLW
 * @email: 1121581012@qq.com
 * @date 15:41 2018/1/7
 */
@Controller
public class MyInfoController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/myInfo")
    public String myInfo(HttpSession session, Model model){
        StudentBaseinfo studentBaseinfo = loginService.selectBystudentId( (Integer) session.getAttribute("id"));
        model.addAttribute(model.addAttribute("baseinfo",studentBaseinfo));
        return "MyInfo";
    }

}
