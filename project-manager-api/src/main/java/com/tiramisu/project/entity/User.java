package com.tiramisu.project.entity;

import lombok.Data;

import java.util.Date;

@Data // 自动生产 get set toString方法
public class User {
    private Integer id; // int
    private String username; // varchar char ...
    private Integer age;
    private Date updateTime;
    private Date createTime;
}
