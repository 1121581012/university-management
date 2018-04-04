package com.glw.controller;

import com.glw.model.MyScore;
import com.glw.model.ScoreAppeal;
import com.glw.service.MyScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:062018/4/3
 */
@Controller
@RequestMapping("MyScoreController")
public class MyScoreController {
    @Autowired
    private MyScoreService myScoreService;

    @RequestMapping("toMyScore")
    public String toMyScore() {
        return "MyScore";
    }


    /**
     * @Description: 显示我的成绩界面
     * @MethodName: showMyScore
     * @Parameter: [session]
     * @Return: java.util.List<com.glw.model.MyScore>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/3 17:36
     * @version V1.0
     */
    @RequestMapping("showMyScore")
    @ResponseBody
    public List<MyScore> showMyScore(HttpSession session){
        Integer studentId = (Integer) session.getAttribute("id");
        return myScoreService.listMyScoreByStudentId(studentId);
    }

    /**
     * @Description: 我的分数申诉
     * @MethodName: saveMyScoreAppeal
     * @Parameter: [session, scoreAppeal]
     * @Return: java.lang.String
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 10:07
     * @version V1.0
     */
    @RequestMapping("saveMyScoreAppeal")
    @ResponseBody
    public String saveMyScoreAppeal(HttpSession session, ScoreAppeal scoreAppeal){
        Integer studentId = (Integer) session.getAttribute("id");
        scoreAppeal.setStudentId(studentId);
        myScoreService.saveMyScoreAppeal(scoreAppeal);
        return null;
    }

}
