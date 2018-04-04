package com.glw.service.impl;

import com.glw.dao.MyScoreMapper;
import com.glw.dao.ScoreAppealMapper;
import com.glw.model.MyScore;
import com.glw.model.ScoreAppeal;
import com.glw.service.MyScoreService;
import com.glw.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:332018/4/3
 */
@Service
public class MyScoreServiceImpl implements MyScoreService {
    @Autowired
    private MyScoreMapper myScoreMapper;
    @Autowired
    private ScoreAppealMapper scoreAppealMapper;

    /**
     * @Description: 根据学生ID查询该学生的分数
     * @MethodName: listMyScoreByStudentId
     * @Parameter: [studentId]
     * @Return: java.util.List<com.glw.model.MyScore>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/3 17:34
     * @version V1.0
     */
    @Override
    public List<MyScore> listMyScoreByStudentId(Integer studentId) {
        return myScoreMapper.listMyScoreByStudentId(studentId);
    }

    /**
     * @Description: 保存我的分数申诉信息
     * @MethodName: saveMyScoreAppeal
     * @Parameter: [scoreAppeal]
     * @Return: java.lang.Integer
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/4/4 10:03
     * @version V1.0
     */
    @Override
    public Integer saveMyScoreAppeal(ScoreAppeal scoreAppeal) {
        scoreAppeal.setTime(new Date());
        scoreAppeal.setType(Constants.APPEAL_TYPE_SCORE);
        scoreAppeal.setStatus(Constants.APPEAL_STATUS_NO);
        return scoreAppealMapper.insertSelective(scoreAppeal);
    }
}
