package com.yss.demo_ticket.service;

/**
 * @Author: LiangJianAn
 * @Description:
 * @Date: 2019/12/5 9:49
 * @Modified By：
 */

import com.yss.demo_model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    /**
     * 一对多查询练习
     * @param id
     * @return
     */
    Student queryStudentById(String id);
}
