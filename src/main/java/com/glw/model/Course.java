package com.glw.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table course
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   ��ʼѡ��ʱ��
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.start_time
     *
     * @mbg.generated
     */
    private Date startTime;

    /**
     * Database Column Remarks:
     *   ����ѡ��ʱ��
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course.finish_time
     *
     * @mbg.generated
     */
    private Date finishTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.id
     *
     * @return the value of course.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.id
     *
     * @param id the value for course.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.name
     *
     * @return the value of course.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.name
     *
     * @param name the value for course.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.start_time
     *
     * @return the value of course.start_time
     *
     * @mbg.generated
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.start_time
     *
     * @param startTime the value for course.start_time
     *
     * @mbg.generated
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course.finish_time
     *
     * @return the value of course.finish_time
     *
     * @mbg.generated
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course.finish_time
     *
     * @param finishTime the value for course.finish_time
     *
     * @mbg.generated
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }
}