package com.yss.demo_ticket.service;

import com.yss.demo_model.Grade;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: LiangJianAn
 * @Description: grade接口
 * @Date: 2019/12/5 14:51
 * @Modified By：
 */
public interface GradeServise {
    /**
     * 根据学生id查询
     *
     * @param studentId
     * @return
     */
    Grade queryGradeByStudentId(@Param("studentId") String studentId);
}
