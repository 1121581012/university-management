package com.glw.service.impl;

import com.glw.dao.BaseinfoAppealMapper;
import com.glw.model.BaseinfoAppeal;
import com.glw.service.BaseInfoAppealService;
import com.glw.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: GaoLiWei
 * @Date: Created in 13:522018/3/29
 */
@Service
public class BaseInfoAppealServiceImpl implements BaseInfoAppealService{

    @Autowired
    private BaseinfoAppealMapper baseinfoAppealMapper;
    /**
     * @Description: 添加学生基本信息申诉
     * @MethodName: saveBaseInfoAppeal
     * @Parameter: [BaseinfoAppeal baseinfoAppeal]
     * @Return: void
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/29 13:55
     * @version V1.0
     */
    @Override
    public void saveBaseInfoAppeal(BaseinfoAppeal baseinfoAppeal) {
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
        String time = dateFormater.format(new Date());
        baseinfoAppeal.setTime(new Date());
        baseinfoAppeal.setStatus(Constants.APPEAL_STATUS_NO);
        baseinfoAppeal.setType(Constants.APPEAL_TYPE_BASE_INFO);
        baseinfoAppealMapper.insertSelective(baseinfoAppeal);
    }
}
