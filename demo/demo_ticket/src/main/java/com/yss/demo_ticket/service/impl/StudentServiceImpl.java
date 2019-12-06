package com.yss.demo_ticket.service.impl;

import com.yss.demo_model.Student;
import com.yss.demo_ticket.mapper.StudentMapper;
import com.yss.demo_ticket.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiangJianAn
 * @Description:
 * @Date: 2019/12/5 10:44
 * @Modified By：
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(String id) {
        return studentMapper.queryStudentById(id);
    }


}
