package com.billy.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


/**
 * 账户表
 */
@TableName("sys_account")
@Data
public class SysAccount {

    private String id;
    private String account_name;
    private String account_pwd;
    private String name;
    private String telephone;
    private Integer type;
    private Integer status;
    private Date create_time;
    private String creator;
    private Date update_time;
    private String updater;
    private String comments;
}
