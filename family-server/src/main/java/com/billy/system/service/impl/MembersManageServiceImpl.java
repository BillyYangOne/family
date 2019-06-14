package com.billy.system.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.system.entity.FamilyMembers;
import com.billy.system.mapper.MembersMapper;
import com.billy.system.service.MembersManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersManageServiceImpl implements MembersManageService {

    @Autowired
    private MembersMapper membersMapper;

    public IPage<FamilyMembers> getMembersByPage(Page page){

        IPage<FamilyMembers> membersByPage = membersMapper.getMembersByPage(page);
        System.out.println("数据长度：" + membersByPage.getRecords());
        return membersByPage;
    }
}
