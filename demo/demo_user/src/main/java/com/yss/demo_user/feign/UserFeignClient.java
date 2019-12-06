package com.yss.demo_user.feign;

import com.yss.demo_model.Grade;
import com.yss.demo_model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: LiangJianAn
 * @Description:    调用买票微服务
 * @Date: 2019/12/4 10:51
 * @Modified By：
 */
@FeignClient(name = "demo-ticket")
public interface UserFeignClient {

    /**
     * 买票
     * @param name
     * @return
     */
    @RequestMapping(value = "/buyTicket/{name}" )
    String buyTicket(@PathVariable String name);

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryStudent/{id}" )
    Student queryStudent(@PathVariable String id);

    /**
     * 根据id查询学生
     * @param studentId
     * @return
     */
    @RequestMapping(value = "/queryGradeByStudentId/{studentId}" )
    Grade queryGradeByStudentId(@PathVariable String studentId);

}
