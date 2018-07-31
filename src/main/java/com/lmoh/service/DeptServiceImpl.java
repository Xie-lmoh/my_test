/**
 * Copyright (C), 2015-2018
 * FileName: DeptServiceImpl
 * Author:   lmoh
 * Date:     2018/7/31 21:11
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lmoh.service;

import com.lmoh.dao.DeptMapper;
import com.lmoh.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lmoh
 * @create 2018/7/31
 * @since 1.0.0
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    //注入dao对象
    @Autowired
    private DeptMapper deptDao;

    public List<Dept> findall() {
        return deptDao.findAll();
    }

}