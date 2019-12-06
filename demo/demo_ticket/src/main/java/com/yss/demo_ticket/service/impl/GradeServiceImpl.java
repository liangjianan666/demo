package com.yss.demo_ticket.service.impl;

import com.yss.demo_model.Grade;
import com.yss.demo_ticket.mapper.GradeMapper;
import com.yss.demo_ticket.service.GradeServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: LiangJianAn
 * @Description:    grade业务层
 * @Date: 2019/12/5 14:54
 * @Modified By：
 */
@Service
public class GradeServiceImpl implements GradeServise {

    @Autowired
    private GradeMapper gradeMapper;
    /**
     * 一对一查询练习，根据学生id查询成绩详情
     * @param studentId
     * @return
     */
    @Override
    public Grade queryGradeByStudentId(String studentId) {
        return gradeMapper.queryGradeByStudentId(studentId);
    }
}
