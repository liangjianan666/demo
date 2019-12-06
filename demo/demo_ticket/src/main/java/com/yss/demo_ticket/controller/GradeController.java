package com.yss.demo_ticket.controller;

import com.yss.demo_model.Grade;
import com.yss.demo_model.Student;
import com.yss.demo_ticket.service.GradeServise;
import com.yss.demo_ticket.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangJianAn
 * @Description:    grade业务层
 * @Date: 2019/12/5 14:50
 * @Modified By：
 */
@RestController
public class GradeController {

    @Autowired
    private GradeServise gradeServise;

    @RequestMapping(value = "/queryGradeByStudentId/{studentId}",method = RequestMethod.GET )
    public Grade queryStudent(@PathVariable String studentId) {
        return gradeServise.queryGradeByStudentId(studentId);
    }
}
