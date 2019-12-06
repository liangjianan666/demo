package com.yss.demo_ticket.mapper;

import com.yss.demo_model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: LiangJianAn
 * @Description:
 * @Date: 2019/12/5 10:47
 * @Modified By：
 */
@Mapper
public interface StudentMapper {

    /**
     * 根据Id查询单个学生对象
     * @param id
     * @return
     */
    Student queryStudentById(@Param("id")String id);
}
