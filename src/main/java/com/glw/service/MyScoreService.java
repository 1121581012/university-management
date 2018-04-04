package com.glw.service;

import com.glw.model.MyScore;
import com.glw.model.ScoreAppeal;

import java.util.List;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:332018/4/3
 */
public interface MyScoreService {

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
    List<MyScore> listMyScoreByStudentId(Integer studentId);

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
    Integer saveMyScoreAppeal(ScoreAppeal scoreAppeal);

}
