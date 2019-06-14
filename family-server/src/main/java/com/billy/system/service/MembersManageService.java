package com.billy.system.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.billy.system.entity.FamilyMembers;

public interface MembersManageService {

    IPage<FamilyMembers> getMembersByPage(Page page);
}
