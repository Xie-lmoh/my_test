/**
 * Copyright (C), 2015-2018
 * FileName: Dept
 * Author:   lmoh
 * Date:     2018/7/31 21:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.lmoh.pojo;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lmoh
 * @create 2018/7/31
 * @since 1.0.0
 */
public class Dept {
    private Integer id;
    private String name;
    private Integer age;
    private Date birDate;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getBirDate() {
        return birDate;
    }
    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }
}