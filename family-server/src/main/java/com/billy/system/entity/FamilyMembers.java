package com.billy.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 成员表
 */
@TableName("family_members")
@Data
public class FamilyMembers {

    private String id;
    private String name;
    private Integer age;
    private Date birthday;
    private String familyStatus;
    private String personalProfile;
    private Date createTime;
    private String creator;
    private Date updateTime;
    private String updater;
    private String comments;
}
