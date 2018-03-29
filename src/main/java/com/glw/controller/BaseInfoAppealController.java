package com.glw.controller;

import com.glw.model.BaseinfoAppeal;
import com.glw.service.BaseInfoAppealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: GaoLiWei
 * @Date: Created in 13:472018/3/29
 */
@Controller
@RequestMapping("BaseInfoAppeal")
public class BaseInfoAppealController {
    @Autowired
    private BaseInfoAppealService baseInfoAppealService;

    @RequestMapping("saveBaseInfoAppeal")
    @ResponseBody
    public String saveBaseInfoAppeal(HttpServletRequest request, BaseinfoAppeal baseinfoAppeal) {
        Integer id = (Integer) request.getSession().getAttribute("id");
        baseinfoAppeal.setStudentId(id);
        baseInfoAppealService.saveBaseInfoAppeal(baseinfoAppeal);
        return "ok";
    }
}
