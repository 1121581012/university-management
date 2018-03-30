package com.glw.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: GaoLiWei
 * @Date: Created in 17:262018/3/29
 */
public interface MyAppealMapper {

    /**
     * @Description: 根据学生ID查询该学生的申诉
     * @MethodName: listMyAppealByStudentId
     * @Parameter:  studentId
     * @Return: List<Map<String,Object>>
     * @author: GaoLiWei
     * @email: 1121581012@qq.com
     * @date 2018/3/29 17:52
     * @version V1.0
     */
    List<Map<String,Object>> listMyAppealByStudentId(@Param("studentId") Integer studentId);
}
