package com.glw.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table login
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Login {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.student_id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.login_time
     *
     * @mbg.generated
     */
    private Date loginTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.id
     *
     * @return the value of login.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.id
     *
     * @param id the value for login.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.student_id
     *
     * @return the value of login.student_id
     *
     * @mbg.generated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.student_id
     *
     * @param studentId the value for login.student_id
     *
     * @mbg.generated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.password
     *
     * @return the value of login.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.password
     *
     * @param password the value for login.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.login_time
     *
     * @return the value of login.login_time
     *
     * @mbg.generated
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.login_time
     *
     * @param loginTime the value for login.login_time
     *
     * @mbg.generated
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}