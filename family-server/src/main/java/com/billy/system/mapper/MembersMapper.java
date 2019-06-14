package com.billy.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.system.entity.FamilyMembers;

public interface MembersMapper extends BaseMapper<FamilyMembers> {

    IPage<FamilyMembers> getMembersByPage(Page page);
}
