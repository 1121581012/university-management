package com.glw.dao;

import com.glw.model.ScoreAppeal;

public interface ScoreAppealMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    int insert(ScoreAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    int insertSelective(ScoreAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    ScoreAppeal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ScoreAppeal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score_appeal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ScoreAppeal record);
}