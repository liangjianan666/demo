package com.yss.demo_ticket.controller;

import com.yss.demo_model.Student;
import com.yss.demo_ticket.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: LiangJianAn
 * @Description:    sutdent业务层
 * @Date: 2019/12/5 10:32
 * @Modified By：
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/queryStudent/{id}",method = RequestMethod.GET )
    public Student queryStudent(@PathVariable String id) {
        return studentService.queryStudentById(id);
    }
}
