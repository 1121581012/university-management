package com.glw.controller;

import com.glw.service.MyAppealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 15:472018/3/29
 */
@Controller
@RequestMapping("MyAppeal")
public class MyAppealController {

    @Autowired
    private MyAppealService myAppealService;
    @RequestMapping("myAppeal")
    public String myAppeal(){
        return "MyAppeal";
    }
    @RequestMapping("showMyAppeal")
    @ResponseBody
    public Map<String,Object> showMyAppeal(HttpSession session){
        Map<String, Object> map = new HashMap<>(1);
        Integer studentId =(Integer) session.getAttribute("id");
        List<Map<String, Object>> myAppeals = myAppealService.listMyAppealByStudentId(studentId);
        map.put("myAppeals",myAppeals);
        return  map;
    }
}
