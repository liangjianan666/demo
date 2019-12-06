package com.yss.demo_model;

/**
 * @Author: LiangJianAn
 * @Description:    成绩实体类
 * @Date: 2019/12/5 14:06
 * @Modified By：
 */
public class Grade {
    private String id;
    private String subject;
    private Integer score;
    private String studentId;

    //一对一关系
    private Student student;

    public Grade() {
    }

    public Grade(String id, String subject, Integer score, String studentId, Student student) {
        this.id = id;
        this.subject = subject;
        this.score = score;
        this.studentId = studentId;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
