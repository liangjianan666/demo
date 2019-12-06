package com.yss.demo_model;

import java.util.List;

/**
 * @Author: LiangJianAn
 * @Description:    学生实体类
 * @Date: 2019/12/5 10:39
 * @Modified By：
 */
public class Student {
    private String id;
    private String name;
    private Integer age;

    private List<Grade> gradeList;

    public Student() {
    }

    public Student(String id, String name, Integer age, List<Grade> gradeList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gradeList = gradeList;
    }

    public Student(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<Grade> gradeList) {
        this.gradeList = gradeList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
