/**
 * Copyright (C), 2015-2018
 * FileName: DeptController
 * Author:   lmoh
 * Date:     2018/7/31 21:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lmoh.controller;

import com.lmoh.pojo.Dept;
import com.lmoh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lmoh
 * @create 2018/7/31
 * @since 1.0.0
 */
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/find")
    public String find(ModelMap model, HttpServletRequest request){
        List<Dept> deptList=deptService.findall();
        //将获取到的数据存入ModelMap中，以便页面取出
        model.addAttribute("depts", deptList);
        return "dept";
    }

}