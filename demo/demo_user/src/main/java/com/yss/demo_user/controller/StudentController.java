package com.yss.demo_user.controller;

import com.yss.demo_model.Student;
import com.yss.demo_user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LiangJianAn
 * @Description:    学生controller
 * @Date: 2019/12/4 10:49
 * @Modified By：
 */
@RestController
public class StudentController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping(value = "/student/{studentId}",method = RequestMethod.GET)
    public Student queryStudent(@PathVariable String studentId) {
        return userFeignClient.queryStudent(studentId);
    }
}
