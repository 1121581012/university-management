package com.glw.dao;

import com.glw.model.MyScore;

public interface MyScoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    int insert(MyScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    int insertSelective(MyScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    MyScore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MyScore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_score
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MyScore record);
}