package com.tiramisu.project.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Example {
    private Integer id;

    private String name;

    private String remark;

    private Date updateTime;

    private Date createTime;
}