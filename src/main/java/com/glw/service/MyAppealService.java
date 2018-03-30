package com.glw.service;

import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:222018/3/29
 */
public interface MyAppealService {
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
    List<Map<String,Object>>listMyAppealByStudentId(int id);
}
