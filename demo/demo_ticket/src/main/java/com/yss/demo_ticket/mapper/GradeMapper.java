package com.yss.demo_ticket.mapper;

import com.yss.demo_model.Grade;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: LiangJianAn
 * @Description:    grade的持久层
 * @Date: 2019/12/5 14:58
 * @Modified By：
 */
@Mapper
public interface GradeMapper {

    /**
     * 一对一连接查询练习
     * @param studentId
     * @return
     */
    Grade queryGradeByStudentId(@Param("studentId") String studentId);
}
