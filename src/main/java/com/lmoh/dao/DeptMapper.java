package com.lmoh.dao;

import com.lmoh.pojo.Dept;

import java.util.List;

/**
 * @Author:Liyoh-Frank
 * @Description:
 * @Version: $Rev$
 * @Date: 2018/7/31 21:07
 * @LoveAndThanks: Misty
 */
public interface DeptMapper {
    //查找所有内容
    public List<Dept> findAll();
}
