package com.billy.system.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.core.BaseController;
import com.billy.system.entity.FamilyMembers;
import com.billy.system.service.MembersManageService;
import com.billy.util.Messager;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "MemberManageController")
@RestController
@RequestMapping("family_server")
public class MemberManageController extends BaseController {

    @Autowired
    private MembersManageService manageService;

    /**
     *  获取成员
     * @return
     */
    @ApiOperation(value = "查询家庭成员", notes = "查询家庭成员")
    @ApiImplicitParams(@ApiImplicitParam(name = "name", value = "姓名", paramType = "query", dataType = "String"))
    @RequestMapping(value = "getMembers",  method = RequestMethod.GET)
    public Object getMembers(String name){

        logger.debug("开始。。。");
        System.out.println(name);
        Page<FamilyMembers> page = new Page<>();
        page.setCurrent(1);
        page.setSize(10);
        IPage<FamilyMembers> membersByPage = manageService.getMembersByPage(page);
        Messager result = messager.successObjectResponse(membersByPage);
        return result;
    }
}
