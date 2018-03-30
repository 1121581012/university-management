package com.glw.service.impl;

import com.glw.dao.MyAppealMapper;
import com.glw.service.MyAppealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:242018/3/29
 */
@Service
public class MyAppealServiceImpl implements MyAppealService {
    @Autowired
    private MyAppealMapper myAppealMapper;

    /**
     * @Description: 根据学生ID查询该学生的申诉
     * @MethodName: listMyAppealByStudentId
     * @Parameter: [id]
     * @Return: java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/29 17:51
     * @version V1.0
     */
    @Override
    public List<Map<String, Object>> listMyAppealByStudentId(int id) {

        List<Map<String, Object>> MyAppeals = myAppealMapper.listMyAppealByStudentId(id);
        if (MyAppeals.size()>0){
            return MyAppeals;
        }
        return null;
    }
}
