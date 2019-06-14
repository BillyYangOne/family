package com.billy.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.core.BaseController;
import com.billy.system.entity.FamilyMembers;
import com.billy.system.service.MembersManageService;
import com.billy.util.Messager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("member")
public class MemberManageController extends BaseController {

    @Autowired
    private MembersManageService manageService;

    /**
     *  获取成员
     * @return
     */
    @RequestMapping("getMembers")
    public Object getMembers(){

        Page<FamilyMembers> page = new Page<>();
        IPage<FamilyMembers> membersByPage = manageService.getMembersByPage(page);
        Messager result = messager.successObjectResponse(membersByPage);
        return result;
    }
}
